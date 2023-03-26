package csense.kotlin.annotations.exceptions

/**
 * Tells that a given lambda argument will rethrow exceptions
 * This goes in hand with the kotlin checked exception plugin.
 */
@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.TYPE //for functional types
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class RethrowsExceptions
