package com.sample

import kotlinx.coroutines.MainScope

actual inline fun getAppScope() = MainScope()
