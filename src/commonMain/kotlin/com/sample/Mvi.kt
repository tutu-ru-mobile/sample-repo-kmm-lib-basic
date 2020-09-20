package com.sample

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

typealias Reducer<S, A> = (S, A) -> S

interface Store<S, A> {
    fun send(action: A)
    val stateFlow: StateFlow<S>
    val state get() = stateFlow.value
}

/**
 * Самая простая реализация MVI архитектуры для слоя представления.
 * В реальном проекте также нужно добавить обработку SideEffect-ов
 */
fun <S, A> createStore(init: S, reducer: Reducer<S, A>): Store<S, A> {
    val mutableStateFlow = MutableStateFlow(init)
    val channel: Channel<A> = Channel(Channel.UNLIMITED)

    return object : Store<S, A> {
        init {
            //https://m.habr.com/ru/company/kaspersky/blog/513364/
            //or alternative in jvm use fun CoroutineScope.actor(...)
            getAppScope().launch {
                channel.consumeAsFlow().collect { action ->
                    mutableStateFlow.value = reducer(mutableStateFlow.value, action)
                }
            }
        }

        override fun send(action: A) {
            channel.offer(action)//mutableStateFlow.value = reducer(mutableStateFlow.value, action)
        }

        override val stateFlow: StateFlow<S> = mutableStateFlow
    }
}
