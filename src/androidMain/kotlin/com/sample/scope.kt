package com.sample

import kotlinx.coroutines.*

actual fun launchCoroutineSingleThread(block: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Main) { block() }
}

actual val APP_SCOPE:CoroutineScope = MainScope()
