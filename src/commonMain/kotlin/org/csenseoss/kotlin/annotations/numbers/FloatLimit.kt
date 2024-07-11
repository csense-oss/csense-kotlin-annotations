@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.numbers

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.ANNOTATION_CLASS
)

@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class FloatLimit(
    val from: Float = Float.MIN_VALUE,
    val to: Float = Float.MAX_VALUE
)