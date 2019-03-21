package com.jp.algorithms.other;

import org.junit.Assert;
import org.junit.Test;

public class CheckBalancedParenthesesTest {
    @Test
    public void checkBalancedParenthesesTrue1() {
        //Given
        String expression = "3x*4+(12-[7-3]*4)+5";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertTrue(checkBalancedParentheses.areParenthesesBalanced(expression));
    }

    @Test
    public void checkBalancedParenthesesTrue2() {
        //Given
        String expression = "(3-1)*{[7+3*(2+(1/4))*6]+12}";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertTrue(checkBalancedParentheses.areParenthesesBalanced(expression));
    }

    @Test
    public void checkBalancedParenthesesTrue3() {
        //Given
        String expression = "(7+3)*{12^4*[3+4]*(12*3)/(7*(-4/2))}";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertTrue(checkBalancedParentheses.areParenthesesBalanced(expression));
    }

    @Test
    public void checkBalancedParenthesesFalse1() {
        //Given
        String expression = "(3-1))*{[7+3*(2+(1/4))*6]+12}";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertFalse(checkBalancedParentheses.areParenthesesBalanced(expression));
    }

    @Test
    public void checkBalancedParenthesesFalse2() {
        //Given
        String expression = "(3-1)*{[7+3*(2+(1/4))*6]+12}}";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertFalse(checkBalancedParentheses.areParenthesesBalanced(expression));
    }

    @Test
    public void checkBalancedParenthesesFalse3() {
        //Given
        String expression = "(3-1)*{[7+3*(2+(1/4))(((*6]+12}";
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        //When & Then
        Assert.assertFalse(checkBalancedParentheses.areParenthesesBalanced(expression));
    }
}
