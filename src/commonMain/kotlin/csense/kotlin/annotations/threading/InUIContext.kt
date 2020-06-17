@file:Suppress("unused")

package csense.kotlin.annotations.threading

@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
public annotation class InUiContext