@file:Suppress("unused", "UNUSED_VARIABLE", "UNUSED_PARAMETER")

package org.csenseoss.kotlin.annotations.unitsystem

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
    /**
     * If the plugin should warn / highlight interactions between non annotated functions and variables, and those annotated with a unit system
     */
    val shouldWarnOnMissingUnits: Boolean = false,
    /**
     * Warn the user(via the plugin) when the units are not matching.
     */
    val shouldWarnOnMismatchingUnitsInGeneral: Boolean = true
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

/**
 * Allows the given method to convert unit system types, this means that unit system checking is off for this function.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class UnitConversion



// Examples:
/**
 * //Declaring unit system(s),simple:
 *
 * @UnitSystemOf
 * public sealed interface AndroidDisplaySizes {
 *     public annotation class PX
 *     public annotation class DP
 *     public annotation class SP
 * }
 *
 * //declaring unit system(s), with easier to use annotations
 *
 * @UnitSystemOf
 * public sealed interface Fruits
 *
 * @UnitTypeOf(Fruits::class)
 * public annotation class Apple
 *
 * @UnitTypeOf(Fruits::class)
 * public annotation class Banana
 *
 *
 */