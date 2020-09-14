package com.sample

/**
 * Для простоты примера я минимально использую корутины и эта функиця запускает корутины самым простым способом
 * В настоящем коде следует использовать CoroutineScope и Job-ы
 */
expect fun launchCoroutineSingleThread(block: suspend () -> Unit)
