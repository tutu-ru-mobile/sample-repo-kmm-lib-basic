package com.sample

import kotlinx.coroutines.*

actual inline fun getAppScope():CoroutineScope = MainScope()
