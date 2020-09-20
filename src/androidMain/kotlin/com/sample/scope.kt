package com.sample

import kotlinx.coroutines.*

actual internal inline fun getAppScope():CoroutineScope = MainScope()
