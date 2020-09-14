package com.sample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

actual fun launchCoroutineSingleThread(block: suspend () -> Unit) {
    GlobalScope.launch(newSingleThreadContext("mySingleThreadContext")) { block() }
}
