package com.sample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

actual fun launchCoroutineDirty(block: suspend () -> Unit) {//todo
    GlobalScope.launch(newSingleThreadContext("mySingleThreadContext")) { block() }
}
