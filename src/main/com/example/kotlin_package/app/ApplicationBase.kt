package com.example.kotlin_package.app


/******************************************************************************
 * Application base class.
 *****************************************************************************/
abstract class ApplicationBase()
{
    /******************************************************************************
     * Current application arguments.
     *****************************************************************************/
    protected var _args: MutableList<String> = mutableListOf<String>()
    /******************************************************************************
     * Current application arguments property.
     *****************************************************************************/
    val args get() = this._args

    /******************************************************************************
     * Run application.
     * 
     * @param[args] Application arguments.
     * @return Application Exit code.
     *****************************************************************************/
    abstract fun run(vararg args: String) : Int
}
