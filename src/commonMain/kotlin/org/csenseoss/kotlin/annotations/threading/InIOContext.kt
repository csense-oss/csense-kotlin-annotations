package org.csenseoss.kotlin.annotations.threading

/**
 * Denotes that the given MUST be executed in the IO thread
 * This applies to the whole scope (eg a whole class)
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
public annotation class InIOContext