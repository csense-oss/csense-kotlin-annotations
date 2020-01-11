@file:Suppress("unused")

package csense.kotlin.annotations.inheritance

/**
 * This annotations denotes that children classes / inheritors must have a parameter less constructor
 * since this cannot be expressed in the type system this is the second best option (otherwise an abstract class is the closets option)
 */
@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
annotation class ParameterLessConstructorRequired {
}