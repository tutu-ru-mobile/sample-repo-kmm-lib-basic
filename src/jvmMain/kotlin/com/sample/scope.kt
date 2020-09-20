@file:JvmName("scopeJvm")//todo
package com.sample

import kotlinx.coroutines.*

actual fun launchCoroutineSingleThread(block: suspend () -> Unit) {
    GlobalScope.launch(newSingleThreadContext("mySingleThreadContext")) { block() }
}

actual val APP_SCOPE: CoroutineScope =
    CoroutineScope(SupervisorJob() + newSingleThreadContext("mySingleThreadContext"))
