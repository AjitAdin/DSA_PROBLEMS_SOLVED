// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedParenthesis
{

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}


//method 2 IMPORTANT
//
//public class BalancedParenthesis {
//    public static void main(String[] args) {
//        String str = "[({})]";  // input string to check
//        char[] stack = new char[str.length()];  // stack size should be the same as the string length
//        int top = -1;  // stack pointer
//
//        // Iterate through each character of the string
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//
//            // If current character is an opening bracket, push it onto the stack
//            if (currentChar == '[' || currentChar == '(' || currentChar == '{') {
//                stack[++top] = currentChar;
//            }
//            // If current character is a closing bracket
//            else if (currentChar == ']' || currentChar == ')' || currentChar == '}') {
//                // Ensure the stack is not empty (no matching opening bracket)
//                if (top == -1) {
//                    System.out.println("Not Balanced");
//                    return;
//                }
//
//                // Pop the top element of the stack and check for matching brackets
//                char topChar = stack[top--];
//                if ((topChar == '[' && currentChar != ']') ||
//                        (topChar == '(' && currentChar != ')') ||
//                        (topChar == '{' && currentChar != '}')) {
//                    System.out.println("Not Balanced");
//                    return;
//                }
//            }
//        }
//
//        // If the stack is empty, all brackets were balanced
//        if (top == -1) {
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Not Balanced");
//        }
//    }
//}
