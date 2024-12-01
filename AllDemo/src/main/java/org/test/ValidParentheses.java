package org.test;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int balance = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                balance++;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                balance--;
                // Check if the closing parenthesis matches the last opening parenthesis
                if (balance < 0 || (ch == ')' && s.charAt(s.length() - balance - 1) != '(') ||
                        (ch == ']' && s.charAt(s.length() - balance - 1) != '[') ||
                        (ch == '}' && s.charAt(s.length() - balance - 1) != '{')) {
                    return false;
                }
            }
        }
        // Ensure balance is zero at the end
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // Output: true
        System.out.println(isValid("()[]{}"));   // Output: true
        System.out.println(isValid("(]"));       // Output: false
        System.out.println(isValid("([)]"));     // Output: false
    }
}
