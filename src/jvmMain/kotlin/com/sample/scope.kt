@file:JvmName("ScopeJvm")//todo compilation error  Duplicate JVM class name 'com/sample/ScopeKt'
package com.sample

import kotlinx.coroutines.*

actual internal inline fun getAppScope(): CoroutineScope =
    CoroutineScope(SupervisorJob() + newSingleThreadContext("mySingleThreadContext"))
