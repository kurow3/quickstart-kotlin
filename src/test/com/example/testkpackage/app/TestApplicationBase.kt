package com.example.testkpackage.app


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.kpackage.app.ApplicationBase


/******************************************************************************
 * Unit test class for ApplicationBase.
 *****************************************************************************/
class TestApplicationBase
{
    /******************************************************************************
     * Unit test method for primary constructor.
     *****************************************************************************/
    @Test
    fun testPrimaryConstructor()
    {
        val expectedArgsProperty = mutableListOf<String>()
        val subclassInstance = object : ApplicationBase()
        {
            override fun run(vararg args: String) : Int
            {
                return 0
            }
        }
        val actualArgsProperty = subclassInstance.args
        Assertions.assertEquals(expectedArgsProperty, actualArgsProperty)
    }
}
