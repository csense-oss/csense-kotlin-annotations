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

@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
public annotation class IntLimit(
    val from: Int = Int.MIN_VALUE,
    val to: Int = Int.MAX_VALUE
)
