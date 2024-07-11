@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.sideEffect

/**
 * Annotations that the given function have no side effect.
 * This implies that iff there is a return value,
 * it HAS to be used, as not using it would equal not calling the function.
 * Nb, a throwing method is "technically" not pure.
 */
@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class Pure