package org.csenseoss.kotlin.annotations.implementation

/**
 * Marks the given class, or type (and children), as required to have an Equals implementation, that is, the built-in is not sufficient.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.TYPE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class MustImplementEquals