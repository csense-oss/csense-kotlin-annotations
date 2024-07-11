package org.csenseoss.kotlin.annotations.collections

/**
 * Denotes that the given collection (say, list , array or alike) have at least the specified number of elements
 * @property minNumberOfItems Int the size this collection will at least "contain" / return
 */
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
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
public annotation class CollectionSizeAtLeast(val minNumberOfItems: Int)