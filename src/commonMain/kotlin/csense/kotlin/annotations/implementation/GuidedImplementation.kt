@file:Suppress("unused")

package csense.kotlin.annotations.implementation

/**
 * This is a concept about "guiding" the implementation of said interface or abstract class (or methods / fields hereof)
 * The idea is that if you are given a said interface to implement then more often than not, there will be certain requirements,
 * say "ceremonial code" or other "almost" guaranteed things (say some repetitive code that cannot be avoided)
 * And thus you want the user to have that "template" instead of a simple "TO DO" comment
 * this could also serve as Multiple guided implementation where you can showcase various implementation and let the user decide what to do.
 *
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CLASS,
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
public annotation class GuidedImplementation(val description: String, val code: String)