@file:Suppress("unused")

package csense.kotlin.annotations.inheritance

@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
annotation class SuperCallRequired