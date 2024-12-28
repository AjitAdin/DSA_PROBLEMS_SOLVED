import java.util.Stack;
import java.util.Scanner;
public class InfixToPostfix{
    public static void main(String args[]){
        Stack<Character> stack=new Stack<>();
        StringBuilder postfix=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String infix=scanner.nextLine();


        for(int i=0;i<infix.length();i++){
            char c=infix.charAt(i);
            if(Character.isLetter(c)){
                postfix.append(c);
            }
            else if(c=='('){
                stack.push('(');
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() &&precedence(c)<=precedence(stack.peek())){
                    postfix.append(stack.pop());

                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        System.out.println("postfix: "+postfix);
    }

    public static int precedence(char operator){
        switch(operator){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':

                return 3;
            default:
                return 0;
        }
    }
}