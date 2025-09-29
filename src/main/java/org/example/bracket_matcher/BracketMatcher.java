package org.example.bracket_matcher;

import java.util.Stack;

public class BracketMatcher {
    public static String BracketMatcher(String str) {
        // code goes here
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "0";
                }
            }
        }

        return stack.isEmpty() ? "1" : "0";
    }
}
