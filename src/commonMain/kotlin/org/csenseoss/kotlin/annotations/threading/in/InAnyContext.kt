@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.threading.`in`

/**
 * Denotes that the given context (the whole class/file etc.)
 * can execute in whatever threading state (say UI, background, IO etc.)
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
public annotation class InAnyContext