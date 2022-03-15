@file:Suppress("unused")

package csense.kotlin.annotations.inheritance

/**
 * This annotation denotes that children classes / inheritors must have a parameter less constructor
 * since this cannot be expressed in the type system this is the second-best option (otherwise an abstract class is the closets option)
 */
@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.BINARY) 
@MustBeDocumented
public annotation class ParameterLessConstructorRequired 