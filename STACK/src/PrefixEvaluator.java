import java.util.Stack;

public class PrefixEvaluator {
    public static void main(String[] args) {
        String prefix = "+9*26";
        Stack<Integer> stack = new Stack<>();


        for (int i = prefix.length()-1; i>=0; i--) {
            char c = prefix.charAt(i);

            if (Character.isDigit(c)) {

                stack.push(c - '0');  // '0' -> 0, '1' -> 1, ..., '9' -> 9
            } else {
                // Pop two operands from the stack
                int b = stack.pop();  // Second operand
                int a = stack.pop();  // First operand

                // Perform the operation based on the current operator (c)
                int temp = 0;  // To store the result of the operation
                switch (c) {
                    case '+':
                        temp = a + b;
                        break;
                    case '-':
                        temp = a - b;
                        break;
                    case '*':
                        temp = a * b;
                        break;
                    case '/':
                        if (b != 0) {
                            temp = a / b;  // Handle division
                        } else {
                            System.out.println("Error: Division by zero");
                            return;  // Exit if division by zero is attempted
                        }
                        break;
                    default:
                        System.out.println("Unknown operator: " + c);
                        return;  // Exit if an unknown operator is encountered
                }

                // Push the result back onto the stack
                stack.push(temp);
            }
        }

        // The final result should be the only item left in the stack
        System.out.println("Result: " + stack.pop());
    }
}
