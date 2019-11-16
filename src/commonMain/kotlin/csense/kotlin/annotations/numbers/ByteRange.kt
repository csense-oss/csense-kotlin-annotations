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
annotation class ByteRange(
    val from: Byte = Byte.MIN_VALUE,
    val to: Byte = Byte.MAX_VALUE
)