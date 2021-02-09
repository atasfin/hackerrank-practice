package HackerRank;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SolutionBalancedBrackets {

    // Complete the isBalanced function below.
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
                    if ((s.charAt(i) == ')' && topStack != '(') || (s.charAt(i) == '}' && topStack != '{' ) || (s.charAt(i) == ']' && topStack != '[')){
                        return "NO";
                    }
//                    if (s.charAt(i) == ')' && topStack != '(') {
//                        return "NO";
//                    }
//                    else if(s.charAt(i) == '}' && topStack != '{' ){
//                        return "NO";
//                    }
//                    else if (s.charAt(i) == ']' && topStack != '[') {
//                        return "NO";
//                    }
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }

    }


    public static void main(String[] args) throws IOException {

        String input = "{}{}{}{}(((())))[]";
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        String input3 = "{{[[(())]]}}";
        String result = isBalanced(input);
        String result1 = isBalanced(input1);
        String result2 = isBalanced(input2);
        String result3 = isBalanced(input3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
