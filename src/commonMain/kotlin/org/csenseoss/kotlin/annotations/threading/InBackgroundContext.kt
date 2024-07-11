@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.threading

/**
 * Denotes that something MUST happen in the background(threading)
 * so eg IO (should not be done in the UI)
 * or long computing tasks / slow computations.
 * This applies to the whole scope (eg a whole class)
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
public annotation class InBackgroundContext