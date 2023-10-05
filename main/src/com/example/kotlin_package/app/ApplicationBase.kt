package com.example.kotlin_package.app


/******************************************************************************
 * Application base class.
 *****************************************************************************/
public abstract class ApplicationBase()
{
    /******************************************************************************
     * Current application arguments.
     *****************************************************************************/
    public open var args: Array<String> = emptyArray<String>()
        protected set

    /******************************************************************************
     * Run application.
     * 
     * @param[args] Application arguments.
     * @return Application Exit code.
     *****************************************************************************/
    public abstract fun run(args: Array<String>) : Int
}
