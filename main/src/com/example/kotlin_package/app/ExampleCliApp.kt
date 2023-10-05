package com.example.kotlin_package.app


import com.example.java_package.lib.ExampleUtils


/******************************************************************************
 * Example CLI Application class.
 *****************************************************************************/
public class ExampleCliApp() : ApplicationBase()
{
    /******************************************************************************
     * Run application.
     * 
     * @param[args] Application arguments.
     * @return Application Exit code.
     *****************************************************************************/
    public override fun run(args: Array<String>) : Int
    {
        try
        {
            this.args = args
            for(str in this.args)
            {
                println(ExampleUtils.decorateStr(str, "*+:.. ", true))
            }

            return ExitCode.SUCCESS.value
        }
        catch(e: Exception)
        {
            e.printStackTrace()

            return ExitCode.UNKNOWN_ERROR.value
        }
    }


    /******************************************************************************
     * Example CLI Application exit code.
     * 
     * @property[value] the value of exit code.
     *****************************************************************************/
    public enum class ExitCode(val value: Int)
    {
        /******************************************************************************
         * Successful termination.
         *****************************************************************************/
        SUCCESS(0),
        /******************************************************************************
         * Termination due to unexpected exception.
         *****************************************************************************/
        UNKNOWN_ERROR(1);
    }
}
