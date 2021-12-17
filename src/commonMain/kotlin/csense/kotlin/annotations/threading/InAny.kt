@file:Suppress("unused")

package csense.kotlin.annotations.threading

/**
 * Denotes that the given can execute in whatever threading state (say UI, background, IO etc)
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