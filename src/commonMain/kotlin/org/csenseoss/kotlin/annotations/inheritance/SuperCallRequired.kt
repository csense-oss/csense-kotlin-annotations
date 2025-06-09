@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.inheritance

/**
 * Means you have to call the super implementation and cannot skip it.
 */
@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class SuperCallRequired