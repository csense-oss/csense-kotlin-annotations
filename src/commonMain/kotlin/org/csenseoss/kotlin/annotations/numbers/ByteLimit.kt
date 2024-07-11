@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.numbers

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.TYPE//until you can annotate functional parameters
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class ByteLimit(
    val from: Byte = Byte.MIN_VALUE,
    val to: Byte = Byte.MAX_VALUE
)