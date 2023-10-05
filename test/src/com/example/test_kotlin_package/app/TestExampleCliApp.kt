package com.example.test_kotlin_package.app


import kotlin.test.assertEquals
import kotlin.test.Test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.kotlin_package.app.ExampleCliApp


/******************************************************************************
 * Unit test class for ExampleCliApp.
 *****************************************************************************/
class TestExampleCliApp
{
    /******************************************************************************
     * Unit test method for primary constructor.
     *****************************************************************************/
    @Test
    fun testPrimaryConstructor()
    {
        val expectedArgsProperty = mutableListOf<String>()
        val classInstance = ExampleCliApp()
        val actualArgsProperty = classInstance.args
        assertEquals(expectedArgsProperty, actualArgsProperty)
    }

    /******************************************************************************
     * Unit test method for run(vararg String).
     *****************************************************************************/
    @ParameterizedTest
    @CsvSource(
        "'', '0'",
        "'a', '0'",
        "'a, b, c', '0'",
    )
    fun testRun(argArgsArray: String, expectedReturnValue: Int)
    {
        val argArgs = argArgsArray.split(",").toTypedArray()
        val expectedArgsProperty = mutableListOf<String>(*argArgs)
        val classInstance = ExampleCliApp()
        val actualReturnValue = classInstance.run(*argArgs)
        val actualArgsProperty = classInstance.args
        assertEquals(expectedReturnValue, actualReturnValue)
        assertEquals(expectedArgsProperty, actualArgsProperty)
    }
}
