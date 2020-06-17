@file:Suppress("unused")

package csense.kotlin.annotations.collections

/**
 * Denotes that the given collection (say, list , array or alike) have the exact size specified.
 * @property exactSize Int the size this collection will "contain" / return
 * @constructor
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
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
public annotation class CollectionSize(val exactSize: Int)

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
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
public annotation class CollectionSizeAtMax(val maxNumberOfItems: Int)

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
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
public annotation class CollectionSizeAtLeast(val minNumberOfItems: Int)

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
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
public annotation class CollectionSizeRange(val fromNumberOfItems: Int, val toNumberOfItems: Int)

