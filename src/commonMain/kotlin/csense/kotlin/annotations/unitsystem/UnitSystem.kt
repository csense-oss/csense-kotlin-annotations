@file:Suppress("unused", "UNUSED_VARIABLE", "UNUSED_PARAMETER")

package csense.kotlin.annotations.unitsystem

import kotlin.reflect.KClass

/**
 * Used to start a new "unit" system
 * If marked on say a sealed interface with annotation "sub" classes (inside), they would be considered part of the unit system
 *
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class UnitSystemOf(
    val shouldWarnOnMissingUnits: Boolean = false,
    val shouldWarnOnMismatchingUnitsInGeneral: Boolean = true,
    val shouldMarkOccurrencesWithUnits: Boolean = false //TODO?
)

/**
 * Adds the annotated class to the given [kClass] UnitSystem (requires the [kClass] to be annotated with [UnitSystemOf])
 */
@Target(AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class UnitTypeOf(
    val kClass: KClass<out Any>
)