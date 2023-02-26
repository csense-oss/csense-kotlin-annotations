@file:Suppress("unused")

package csense.kotlin.annotations.sideEffect

/**
 * Denotes a function will have side effects, either to the current class or any input parameters.
 */
@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class SideEffects