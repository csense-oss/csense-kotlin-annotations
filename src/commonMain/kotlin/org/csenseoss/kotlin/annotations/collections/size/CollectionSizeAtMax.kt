package org.csenseoss.kotlin.annotations.collections.size

/**
 * Denotes that the given collection (say, list , array or alike) have at max the specified number of elements
 * @property maxNumberOfItems Int the size this collection will at max "contain" / return
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
public annotation class CollectionSizeAtMax(val maxNumberOfItems: Int)