package com.sample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

actual fun launchCoroutineDirty(block: suspend () -> Unit) {//todo
    GlobalScope.launch(Dispatchers.Main) { block() }
}
