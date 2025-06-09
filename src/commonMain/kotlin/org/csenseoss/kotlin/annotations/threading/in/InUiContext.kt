@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.threading.`in`
/**
 * Denotes that the given context (whole class, file etc.) MUST be executed in the UI thread
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
public annotation class InUiContext