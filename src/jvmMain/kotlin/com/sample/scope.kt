@file:JvmName("scopeJvm")//todo
package com.sample

import kotlinx.coroutines.*

actual val APP_SCOPE: CoroutineScope =
    CoroutineScope(SupervisorJob() + newSingleThreadContext("mySingleThreadContext"))
