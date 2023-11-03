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
    AnnotationTarget.TYPE
)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY) 
public annotation class CollectionSize(val exactSize: Int)

