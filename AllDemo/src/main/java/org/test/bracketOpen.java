package org.test;
import java.util.Stack;

public class bracketOpen {
        public static boolean isValid(String s) {
            while (true) {
                if (s.contains("()")) {
                    s = s.replace("()", "");
                } else if (s.contains("{}")) {
                    s = s.replace("{}", "");
                } else if (s.contains("[]")) {
                    s = s.replace("[]", "");
                } else {
                    // If the string becomes empty, it indicates all brackets are matched.
                    return s.isEmpty();
                }
            }
        }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // Output: true
        System.out.println(isValid("()[]{}"));   // Output: true
        System.out.println(isValid("(]"));       // Output: false
        System.out.println(isValid("([)]"));

        System.out.println(isValid("[[()]]{}"));
    }
}
