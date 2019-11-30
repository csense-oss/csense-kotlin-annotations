@file:Suppress("unused")

package csense.kotlin.annotations.threading

@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.TYPE
)
@MustBeDocumented
annotation class InBackgroundContext
