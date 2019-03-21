package com.jp.algorithms.other;

import java.util.Stack;

public class CheckBalancedParentheses {
    //Rule to follow - last unclosed parentheses must match first closed

    boolean match(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        } else if (opening == '{' && closing == '}') {
            return true;
        } else if (opening == '[' && closing == ']') {
            return true;
        } else {
            return false;
        }
    }

    boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack();
        char[] expressionChars = expression.toCharArray();
        for (int i = 0; i < expressionChars.length; i++) {
            if (expressionChars[i] == '(' || expressionChars[i] == '{' || expressionChars[i] == '[') {
                stack.push(expressionChars[i]);
            } else if (stack.empty() &&
                    (expressionChars[i] == ')' || expressionChars[i] == '}' || expressionChars[i] == ']')) {
                return false;
            } else if (expressionChars[i] == ')' || expressionChars[i] == '}' || expressionChars[i] == ']') {
                if (match(stack.peek(), expressionChars[i])) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

}
