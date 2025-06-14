@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.threading.`in`

/**
 * Denotes that the given can execute in whatever threading state (say UI, background, IO etc.)
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
public annotation class InAny