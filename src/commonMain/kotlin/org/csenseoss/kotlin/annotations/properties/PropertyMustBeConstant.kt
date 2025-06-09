@file:Suppress("unused")

package org.csenseoss.kotlin.annotations.properties


/**
 * Determines that this property must be constant, so not a "complex" getter or just directly initialized.
 * so the following is ok
 * val x= 42
 * and technical this is
 * val x: Int
 *          get()= 42
 * but the following is not
 * val x: Any
 *          get() = RandomObject()
 * as it is not "constant".
 */
@Target(AnnotationTarget.PROPERTY)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY) 
public annotation class PropertyMustBeConstant