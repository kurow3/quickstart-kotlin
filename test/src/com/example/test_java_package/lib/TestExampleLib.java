package com.example.test_java_package.lib;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.example.java_package.lib.ExampleLib;


public class TestExampleLib
{
    @Test
    public void testDecorate()
    {
        String undecorated = "test";
        String expectedDecorated = "*****   test   *****";
        String actualDecorated = ExampleLib.decorate(undecorated);
        Assertions.assertEquals(expectedDecorated, actualDecorated);
    }
}
