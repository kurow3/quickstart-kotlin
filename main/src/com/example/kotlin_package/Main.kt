package com.example.kotlin_package


import kotlin.system.exitProcess

import com.example.kotlin_package.app.ExampleCliApp


/******************************************************************************
 * Main object.
 *****************************************************************************/
public object Main
{
    /******************************************************************************
     * Entry point.
     * 
     * @param[args] Arguments passed from system.
     *****************************************************************************/
    @JvmStatic
    public fun main(args: Array<String>)
    {
        val mainApp = ExampleCliApp()
        exitProcess(mainApp.run(args))
    }
}
