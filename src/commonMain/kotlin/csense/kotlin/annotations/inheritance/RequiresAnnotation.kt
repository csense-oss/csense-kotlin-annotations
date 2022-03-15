package csense.kotlin.annotations.inheritance

import kotlin.reflect.*

@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
public annotation class RequiresAnnotation<T : Annotation>(
    val annotationClass: KClass<T>
)
