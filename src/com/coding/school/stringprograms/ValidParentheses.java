package com.coding.school.stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {
        Map<Character, Character> parenthesesMapping = new HashMap<>();
        parenthesesMapping.put('(', ')');
        parenthesesMapping.put('{', '}');
        parenthesesMapping.put('[', ']');

        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (parenthesesMapping.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (parenthesesMapping.get(ch) != c || !parenthesesMapping.containsKey(ch)) {
                    return false;
                }
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])!"));
    }
}
