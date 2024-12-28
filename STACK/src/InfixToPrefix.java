import java.util.Stack;

class InfixToPrefix {
    public static void main(String[] args) {
        // String infix = "x+y*z/w+u"; // Expected Prefix: ++x/*yzwu
        String infix = "(A-B/C)*(A/K-L)"; // Expected Prefix: *-A/BC-/AKL
        // Step 1: Reverse the infix expression and swap parentheses
        String reversedInfix = reverseAndSwapParentheses(infix);

        // Step 2: Convert the reversed infix to postfix
        String postfix = infixToPostfix(reversedInfix);

        // Step 3: Reverse the postfix expression to get the prefix
        String prefix = reverseString(postfix);

        System.out.println("Prefix expression: " + prefix);
    }

    // Function to reverse a string and swap parentheses
    public static String reverseAndSwapParentheses(String infix) {
        StringBuilder reversed = new StringBuilder();
        for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);
            if (c == '(') {
                reversed.append(')');
            } else if (c == ')') {
                reversed.append('(');
            } else {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Function to convert infix to postfix
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // Append operands directly to the postfix expression
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            // Push '(' to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // Pop and append operators to postfix until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Discard the '('
                }
            }
            // Handle operators
            else {
                // Adjust precedence handling for operators
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c); // Push current operator to the stack
            }
        }

        // Pop any remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to determine the precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^': // Highest precedence (associates right-to-left)
                return 3;
            default:
                return 0; // For non-operators
        }
    }
}


//The issue with your original code lies in how the operator precedence is being handled during the infix to postfix conversion, particularly with respect to operator associativity and the order in which operators are pushed and popped from the stack.
//
//Problem in Your Code:
//The main problem is with how the precedence of operators is being compared when converting from infix to postfix.
//
//In the original code, you're using:
//
//java
//Copy code
//while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
//        postfix.append(stack.pop());
//        }
//What's wrong with this approach?
//This part of the code has an issue with operator precedence comparison. Specifically:
//
//You are using <= for comparison, which causes problems with operator associativity. For example, in cases like * and / (which have equal precedence), the code would incorrectly decide to pop the operator from the stack even when it shouldn't (because * and / are left-associative).
//This can lead to an incorrect order of operators being added to the postfix expression.
//Correct Approach:
//In infix to postfix conversion, the precedence of operators should be handled as follows:
//
//If the current operator has higher precedence than the operator at the top of the stack, push the current operator to the stack.
//If the current operator has lower precedence, pop operators from the stack to the postfix expression until an operator with lower precedence (or a left parenthesis) is found.
//For left-associative operators (like +, -, *, and /), you should use:
//
//java
//Copy code
//while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
//        postfix.append(stack.pop());
//        }
//This ensures that operators with higher or equal precedence are popped in the correct order (respecting left-associativity).
//
//What Was Fixed:
//I corrected the precedence handling in your infixToPostfix method by using:
//
//java
//Copy code
//while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
//        postfix.append(stack.pop());
//        }
//This ensures that the stack only holds operators of lower precedence or higher precedence when necessary.
//
//Final Explanation:
//The infix expression: x + y * z / w + u
//After correctly handling the operator precedence and associativity, we get the correct postfix expression: xyz* / + wu +.
//Reversing this postfix expression gives us the correct prefix expression: ++x/*yzwu.
//With this fix, the output is now as expected:
//
//mathematica
//Copy code
//Prefix expression: ++x/*yzwu
//




