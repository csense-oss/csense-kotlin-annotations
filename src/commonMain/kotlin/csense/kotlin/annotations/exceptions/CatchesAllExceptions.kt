package csense.kotlin.annotations.exceptions

/**
 * Denotes that a given lambda parameter's exceptions will be caught.
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
public annotation class CatchesAllExceptions
