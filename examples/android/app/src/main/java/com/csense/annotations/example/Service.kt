package com.csense.annotations.example

import csense.kotlin.annotations.threading.InBackground
import csense.kotlin.annotations.threading.InBackgroundContext
import csense.kotlin.annotations.threading.InUi

@InBackgroundContext
class Service {

    //This is implicit in the background
    fun computeMagicResult(): ServiceResult {
        return ServiceResult.Failed
    }

    //This is implicit in the background
    fun computeSuccess(): ServiceResult {
        return ServiceResult.Success
    }

    //This is explicit in the background
    @InBackground
    fun imExplicit(): ServiceResult {
        return ServiceResult.valueOf("Success")
    }

    @InUi
    fun forUiGiggles() {
        //this is ok to call from the ui.
    }
}

enum class ServiceResult {
    Success,
    Failed
}