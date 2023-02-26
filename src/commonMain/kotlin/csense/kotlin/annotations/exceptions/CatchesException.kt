package csense.kotlin.annotations.exceptions

import kotlin.reflect.*

/**
 * Denotes that a given lambda parameter's exception(of type T) will be caught.
 * This goes in hand with the kotlin checked exception plugin. 
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
public annotation class CatchesException<T : Exception>(
    val clazz: KClass<T>
)
