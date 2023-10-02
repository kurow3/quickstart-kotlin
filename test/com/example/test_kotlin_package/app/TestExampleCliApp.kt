package com.example.test_kotlin_package.app


import kotlin.test.Test
import kotlin.test.assertEquals

import com.example.kotlin_package.app.ExampleCliApp


class TestExampleCliApp
{
    @Test
    fun testGreeting()
    {
        val classUnderTest = ExampleCliApp()
        val expectedGreeting = "*****   Hello World!   *****"
        val actialGreeting = classUnderTest.greeting
        assertEquals(expectedGreeting, actialGreeting)
    }
}
