package com.example.testjpackage.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.jpackage.utils.ExampleUtils;


/******************************************************************************
 * Unit test class for ExampleUtils.
 *****************************************************************************/
public final class TestExampleUtils
{
    /******************************************************************************
     * Unit test method for reverseStr(String).
     * 
     * @param argStr Argument <str>.
     * @param expectedReturn Expected return value.
     *****************************************************************************/
    @ParameterizedTest
    @CsvSource({
        ", ",
        "'', ''",
        "'test', 'tset'",
    })
    public void testReverseStr(String argStr,
                               String expectedReturn)
    {
        String actualReturn = ExampleUtils.reverseStr(argStr);
        Assertions.assertEquals(expectedReturn, actualReturn);
    }

    /******************************************************************************
     * Unit test method for decorateStr(String, String, boolean).
     * 
     * @param argBody Argument <body>.
     * @param argDecoration Argument <decoration>.
     * @param argFaceToFaceDecoration Argument <faceToFaceDecoration>.
     * @param expectedReturn Expected return value.
     *****************************************************************************/
    @ParameterizedTest
    @CsvSource({
        "'', '', false, ''",
        "'', '', true, ''",
        "'', '*+*+ ', false, '*+*+ *+*+ '",
        "'', '*+*+ ', true, '*+*+  +*+*'",
        "'test',  '', false, 'test'",
        "'test',  '', true, 'test'",
        "'test',  '*+*+ ', false, '*+*+ test*+*+ '",
        "'test',  '*+*+ ', true, '*+*+ test +*+*'",
    })
    public void testDecorateStr(String argBody, String argDecoration, boolean argFaceToFaceDecoration,
                                String expectedReturn)
    {
        String actualReturn = ExampleUtils.decorateStr(argBody, argDecoration, argFaceToFaceDecoration);
        Assertions.assertEquals(expectedReturn, actualReturn);
    }
}
