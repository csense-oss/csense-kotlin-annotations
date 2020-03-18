package com.csense.annotations.example

import android.os.Bundle
import androidx.annotation.WorkerThread
import androidx.appcompat.app.AppCompatActivity
import csense.kotlin.annotations.threading.InBackground
import csense.kotlin.annotations.threading.InUiContext
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

/**
 * This annotations marks all methods as "requiring" the UI thread.
 * thus if you have any background work you can simply / only annotate that instead.
 * You can also interleave android annotations and csense annotations
 */
@InUiContext
class MainActivity : AppCompatActivity() {
    val scope by lazy {
        MainScope()
    }
    val service by lazy {
        Service()
    }

    //This is implicit now in the UI thread
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //Thus calling background tasks results in errors
        loadInBackground()
        loadInBackgroundAndroid()


        service.computeSuccess()
        service.imExplicit()

        service.forUiGiggles()

    }

    @InBackground
    fun loadInBackground() {
        //do work
        service.computeMagicResult()
    }

    @WorkerThread
    fun loadInBackgroundAndroid() {
        //do work
        service.computeSuccess()
        //the following is not allowed
        service.forUiGiggles()
        //but if we wrap it , say
        runOnUiThread {
            //its totally fine.
            service.forUiGiggles()
        }
        //or we use coroutines

        scope.launch(Dispatchers.Main) {
            service.forUiGiggles()
        }
        //but if we do not set the dispatcher then it will error out, say we did
        scope.launch(Dispatchers.IO) {//or "Default", or even UnConfined, we could not guarantee the UI requirement
            service.forUiGiggles()
        }

        iAmAnotherUiThreadedMethod()
    }

    fun iAmAnotherUiThreadedMethod() {

    }
}
