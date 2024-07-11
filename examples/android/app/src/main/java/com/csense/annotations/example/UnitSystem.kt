package com.csense.annotations.example

import csense.kotlin.annotations.unitsystem

public sealed interface AndroidDisplaySizes {
    public data object PX : AndroidDisplaySizes
    public data object DP : AndroidDisplaySizes
}

@UnitSystemOf
public sealed interface AndroidDisplaySizes2 {
    public annotation class PX
    public annotation class DP
    public annotation class SP
}

@UnitTypeOf(AndroidDisplaySizes.PX::class)
public annotation class PX

@UnitTypeOf(AndroidDisplaySizes.PX::class)
public annotation class DP

@DP
public fun pxToDP(@PX px: Int): Int {
    return 11
}


public fun magic() {
    @DP val x: Int = 41
    @PX val y: Int = 41
    //mismatching unit interactions
    val z: Int = x + y

    @DP val q: Int = pxToDP(y) + x
}


//IMPLICIT MODE

@UnitSystemOf
public sealed interface MyUnitSizes {
    public class Oranges(public val oranges: Int) : MyUnitSizes
    public class Bananas(public val oranges: Int) : MyUnitSizes
}

@UnitTypeOf(MyUnitSizes.Bananas::class)
public annotation class Bananas


@UnitTypeOf(MyUnitSizes.Oranges::class)
public annotation class Oranges

public fun useBananasForMinions(
    @Bananas bananas: Int
) {
}

public fun success() {
    //unmarked (should only be highlighted if should warn ...)
    useBananasForMinions(42)
    //marked / "safe" //should "always" be ok
    @Bananas val safe = 42
    useBananasForMinions(safe)
}

public fun fail() {
    //should be highlighted
    @Oranges val oranges = 42
    @Bananas val bananas = 11
    useBananasForMinions(oranges)

    //if warn general , highlight
    val x = max(oranges, bananas)
}


public sealed interface AndroidDisplaySizes {
    public data object PX : AndroidDisplaySizes
    public data object DP : AndroidDisplaySizes
}

@UnitTypeOf(AndroidDisplaySizes.PX::class)
public annotation class PX

@UnitTypeOf(AndroidDisplaySizes.PX::class)
public annotation class DP

@DP
public fun pxToDP(@PX px: Int): Int {
    return 11
}

public fun magic() {
    @DP val x: Int = 41
    @PX val y: Int = 41
    //mismatching unit interactions
    val z: Int = x + y

    @DP val q: Int = pxToDP(y) + x
}