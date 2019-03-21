package com.jp.algorithms.other;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void reverse() {
        //Given
        String string = "String that will be reversed.";
        //When
        string = ReverseString.reverse(string);
        //Then
        Assert.assertEquals(".desrever eb lliw taht gnirtS", string);
    }

    @Test
    public void reverseEmpty() {
        //Given
        String string = "";
        //When
        string = ReverseString.reverse(string);
        //Then
        Assert.assertEquals("", string);
    }

    @Test
    public void reverseNull() {
        //Given
        String string = null;
        //When
        string = ReverseString.reverse(string);
        //Then
        Assert.assertEquals(null, string);
    }
}