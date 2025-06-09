@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.threading.`in`

/**
 * Denotes that something MUST happen in the background(threading)
 * so e.g. IO (should not be done in the UI)
 * or long computing tasks / slow computations.
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.TYPE //for functional types
)
@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class InBackground