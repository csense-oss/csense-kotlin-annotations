@file:Suppress("unused")

package csense.kotlin.annotations.numbers


@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.TYPE//until you can annotate functional parameters
)
@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class NumberLimit(
    val from: Double = Double.MIN_VALUE,
    val to: Double = Double.MAX_VALUE
)