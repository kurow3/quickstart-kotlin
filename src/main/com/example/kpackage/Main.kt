package com.example.kpackage


import kotlin.system.exitProcess

import com.example.kpackage.app.ExampleCliApp


/******************************************************************************
 * Main object.
 *****************************************************************************/
object Main
{
    /******************************************************************************
     * Entry point.
     * 
     * @param[args] Arguments passed from system.
     *****************************************************************************/
    @JvmStatic
    fun main(args: Array<String>)
    {
        val mainApp = ExampleCliApp()
        exitProcess(mainApp.run(*args))
    }
}
