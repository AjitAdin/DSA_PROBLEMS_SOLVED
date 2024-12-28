import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String args[]) {
        String postfix = "abc/-ak/l-*";
        Stack<String> stack = new Stack<>();

        String a;
        String b;
        String temp;

        // Iterate through each character in the postfix expression
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // If the character is an operand (letter or digit), push it to the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            }
            // If the character is an operator, pop two operands from the stack, 
            // and form the prefix expression by operator followed by operands
            else {
                a = stack.pop();
                b = stack.pop();
                temp = c + b + a; // Form the prefix expression by combining operator and operands
                stack.push(temp);
            }
        }

        // The final result is the only element left in the stack, which is the prefix expression
        System.out.println("Prefix: " + stack.pop());
    }
}
