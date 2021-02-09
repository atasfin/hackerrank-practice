package SDET;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        String input1 = "{[]}";
        String input2 = "()()()(){}{}{}{";

        String result1 = isBalanced(input1);
        System.out.println("Balanched? " + result1);
        String result2 = isBalanced(input2);
        System.out.println("Balanched? " + result2);

    }

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char topStack = stack.pop();
                    if (s.charAt(i) == ')' && topStack != '(') {
                        return "NO";
                    }
                    else if(s.charAt(i) == '}' && topStack != '{' ){
                        return "NO";
                    }
                    else if (s.charAt(i) == ']' && topStack != '[') {
                        return "NO";
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }


    }
}