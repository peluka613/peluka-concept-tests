package com.test;

/**
 * Balanced Parentheses Problem -  https://webrewrite.com
 */

import java.util.Stack;

public class ParenthesisMatching {

    public boolean testBalanced(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }
        boolean balanced = true;

        Stack<Character> stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if ("([{".contains(String.valueOf(input.charAt(i)))) {
                stack.push(input.charAt(i));
            } else if (!stack.empty()) {
                char c = stack.peek();
                if ((input.charAt(i) == ']' && c == '[') ||
                        (input.charAt(i) == '}' && c == '{') ||
                        (input.charAt(i) == ')' && c == '(')) {

                    stack.pop();
                }
            }
        }
        if (!stack.empty()) {
            balanced = false;
        } 
        
        return balanced;
    }
}
