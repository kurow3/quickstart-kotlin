package com.example.kpackage.app


import com.example.jpackage.utils.ExampleUtils


/******************************************************************************
 * Example CLI Application class.
 *****************************************************************************/
class ExampleCliApp() : ApplicationBase()
{
    /******************************************************************************
     * Decoration string.
     *****************************************************************************/
    private val _decoration: String = "*+:.. "

    /******************************************************************************
     * Enable face-to-face decoration.
     *****************************************************************************/
    private val _faceToFaceDecoration: Boolean = true

    /******************************************************************************
     * Run application.
     * 
     * Output the argument strings with decorations.
     * If there are multiple arguments, each is output on a new line.
     * 
     * @param[args] Application arguments.
     * @return Application Exit code.
     *****************************************************************************/
    override fun run(vararg args: String) : Int
    {
        try
        {
            this._args = args.toMutableList()
            for(arg in this._args)
            {
                println(ExampleUtils.decorateStr(arg, this._decoration, this._faceToFaceDecoration))
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
    enum class ExitCode(val value: Int)
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
