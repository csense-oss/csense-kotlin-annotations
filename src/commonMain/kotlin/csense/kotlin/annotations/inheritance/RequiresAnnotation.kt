package csense.kotlin.annotations.inheritance

import kotlin.reflect.*

/**
 * Tells that child class(es) requires the given annotation(s)
 * @param T : Annotation
 * @property annotationClass KClass<T>
 * @constructor
 */
@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class RequiresAnnotation<T : Annotation>(
    val annotationClass: KClass<T>
)
