package org.csenseoss.kotlin.annotations.collections.size

/**
 * Denotes that the given collection (say, list , array or alike) have at the given range of elements
 * @property fromNumberOfItems the least amount of elements in this collection
 * @property toNumberOfItems the maximum number of elements in this collection
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
public annotation class CollectionSizeRange(val fromNumberOfItems: Int, val toNumberOfItems: Int)