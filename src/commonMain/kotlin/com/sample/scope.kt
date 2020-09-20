package com.sample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Для простоты примера я минимально использую корутины и эта функиця запускает корутины самым простым способом
 * В настоящем коде следует использовать CoroutineScope и Job-ы
 */
//private val _appScope by lazy {getAppScope()}//todo

fun launchAppScope(block: suspend () -> Unit) {
    getAppScope().launch {
        block()
    }
}

expect inline fun getAppScope():CoroutineScope
