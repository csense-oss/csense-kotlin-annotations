package csense.kotlin.annotations.threading

/**
 * Denotes that a given functional type is run according to the threading/scope of the given (name of) dispatcher
 */
@Target(
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class InSelector(
    /**
     *  The name of the context which "selects" the threading for this. (Eg a parameter)
     */
    val selectorName: String
)
