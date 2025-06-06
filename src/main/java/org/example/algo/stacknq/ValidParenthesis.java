package org.example.algo.stacknq;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(}[{}]{)";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1) return false;
                char last = stack[top--];
                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }
}
