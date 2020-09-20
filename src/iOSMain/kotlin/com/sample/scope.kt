package com.sample

import kotlinx.coroutines.MainScope

actual internal inline fun getAppScope() = MainScope()
