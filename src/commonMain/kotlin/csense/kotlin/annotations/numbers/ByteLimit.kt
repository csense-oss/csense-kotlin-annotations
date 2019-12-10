@file:Suppress("unused")

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

@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
annotation class ByteLimit(
    val from: Byte = Byte.MIN_VALUE,
    val to: Byte = Byte.MAX_VALUE
)