@file:Suppress("unused")

package csense.kotlin.annotations.threading

/**
 * Denotes that something MUST happen in the background(threading)
 * so eg IO (should not be done in the UI)
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