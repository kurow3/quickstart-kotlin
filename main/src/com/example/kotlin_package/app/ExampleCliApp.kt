package com.example.kotlin_package.app

import com.example.java_package.lib.ExampleLib


class ExampleCliApp
{
    val greeting: String
        get()
        {
            return ExampleLib.decorate("Hello World!")
        }
}
