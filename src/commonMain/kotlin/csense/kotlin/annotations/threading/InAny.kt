@file:Suppress("unused")

package csense.kotlin.annotations.threading

/**
 * The concept with this is to allow certain constructs to exists that can work in any context (ui or background alike)
 * this could be constructs that changes the threading model to say UI.
 *
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
annotation class InAny