package com.example.java_package.lib;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/******************************************************************************
 * Example Utility class.
 *****************************************************************************/
public class ExampleUtils
{
    /******************************************************************************
     * Constructor.
     *****************************************************************************/
    private ExampleUtils()
    {
        ;
    }

    /******************************************************************************
     * Reverse string.
     * 
     * @param str Original string.
     * @return Reversed string.
     *****************************************************************************/
    public static String reverseStr(String str)
    {
        if(str == null)
        {
            return null;
        }
        List<Integer> codePoints = str.codePoints()
                                      .boxed()
                                      .collect(Collectors.toList());
        Collections.reverse(codePoints);
        return codePoints.stream()
                         .map(Character::toChars)
                         .map(String::valueOf)
                         .collect(Collectors.joining());
    }

    /******************************************************************************
     * Decorate string.
     * 
     * @param body Body string.
     * @param decoration Decoration string.
     * @param faceToFaceDecoration Enable face-to-face decoration.
     * @throws IllegalArgumentException If string is null.
     * @return Decorated body string.
     *****************************************************************************/
    public static String decorateStr(String body, String decoration, boolean faceToFaceDecoration)
    throws IllegalArgumentException
    {
        if(body == null || decoration == null)
        {
            throw new IllegalArgumentException("String is null.");
        }
        StringBuilder builder = new StringBuilder();
        builder.append(decoration);
        builder.append(body);
        builder.append((faceToFaceDecoration) ? reverseStr(decoration) : decoration);
        return builder.toString();
    }
}
