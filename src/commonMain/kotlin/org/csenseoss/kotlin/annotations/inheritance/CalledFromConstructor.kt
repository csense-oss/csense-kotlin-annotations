@file:Suppress("unused")
package org.csenseoss.kotlin.annotations.inheritance

/**
 * Since some frameworks use non-final methods in the construction of said base classes, we run the risk of "initialization" errors.
 * This is not that easy to compute, so instead we can annotate certain methods (e.g. externally) so that plugins / code inspections can find
 * these potential source of null pointer bugs.
 *
 */
@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY) 
public annotation class CalledFromConstructor