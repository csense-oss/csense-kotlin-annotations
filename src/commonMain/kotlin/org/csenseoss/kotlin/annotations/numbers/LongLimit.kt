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
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.TYPE//until you can annotate functional parameters
)

@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class LongLimit(
    val from: Long = Long.MIN_VALUE,
    val to: Long = Long.MAX_VALUE
)