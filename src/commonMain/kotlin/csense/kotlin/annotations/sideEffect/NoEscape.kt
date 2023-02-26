@file:Suppress("unused")

package csense.kotlin.annotations.sideEffect

/**
 * A concept about stopping users from "taking" a given value.
 * You want (by inversion of control) to give the caller something back, that they can ONLY use for that limited time.
 *  - this could be private keys in cryptography
 *  - android context (so you do not leak)
 *  - threading related data (such as a view binding)
 *  - lifecycle dependent data.
 *
 * This has the potential to avoid memory leaks as you simply are not allowed to "take" dangerous things
 *  it also provides a nice framework for further helping developers implementing your "design" correctly.
 *
 * see https://youtrack.jetbrains.com/issue/KT-29938 for the concept as well.
 */
@Target(
    AnnotationTarget.VALUE_PARAMETER,//TODO hmm not sure ?
    AnnotationTarget.TYPE_PARAMETER,
    AnnotationTarget.TYPE,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.LOCAL_VARIABLE
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class NoEscape