package org.csenseoss.kotlin.annotations.inheritance

import kotlin.reflect.*

/**
 * Tells that child class(es) requires the given annotation(s)
 */
@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class RequiresAnnotation<T : Annotation>(
    val annotationClass: KClass<T>
)