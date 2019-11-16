package csense.kotlin.annotations.numbers

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.ANNOTATION_CLASS
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class DoubleRange(
    val from: Double,
    val to: Double
)
