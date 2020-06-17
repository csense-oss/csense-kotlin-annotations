@file:Suppress("unused")

package csense.kotlin.annotations.unitsystem

/**
 * idea:
 * user declares ValueTypes (as a object) with const vals which are strings (or it might be a enum or alike, or sealed class with string value)
 * @ValueType(ValueTypes.PX)
 * or "UnitType"
 * or UnitSystem
 *
 */

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.BINARY) //binary so its persisted across libraries
@MustBeDocumented
public annotation class UnitSystem(
    val unit: String
)