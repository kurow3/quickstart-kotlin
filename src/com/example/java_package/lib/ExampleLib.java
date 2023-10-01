package com.example.java_package.lib;


public class ExampleLib
{
    private ExampleLib()
    {
        ;
    }

    public static String decorate(String str)
    {
        return String.format("*****   %s   *****", str);
    }
}
