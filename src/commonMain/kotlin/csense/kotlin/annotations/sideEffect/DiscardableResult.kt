@file:Suppress("unused")

package csense.kotlin.annotations.sideEffect

@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
/**
 * Denotes a function return value is not "important" thus not using / storing it is "okay".
 * Usually a function returning something is important and should be used (otherwise it is the side effect that is important)
 * Inspired by the swift language's annotation DiscardableResult
 */
public annotation class DiscardableResult
