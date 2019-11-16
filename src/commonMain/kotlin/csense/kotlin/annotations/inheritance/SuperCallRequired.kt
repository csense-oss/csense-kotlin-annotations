package csense.kotlin.annotations.inheritance

@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class SuperCallRequired