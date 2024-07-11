package org.csenseoss.kotlin.annotations.code

/**
 * Instructions to tools (e.g. the csense kotlin Idea annotations plugin) whenever to color the given
 * @property hexColor String eg "#03BAFC"
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.CLASS
)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
public annotation class ColoredCode(
    val hexColor: String
)