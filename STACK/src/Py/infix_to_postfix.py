class Infix_to_Postfix:
    def cal(self, eq):
        # Lower number = lower precedence
        precedence = {'^': 3, '*': 2, '/': 2, '+': 1, '-': 1}

        stack = []
        postfix = []

        for i in eq:
            if i.isalpha() or i.isdigit():  # operand
                postfix.append(i)
            elif i == '(':
                stack.append(i)
            elif i == ')':
                # Pop until '(' is found
                while stack and stack[-1] != '(':
                    postfix.append(stack.pop())
                stack.pop()  # remove '('                                       
            else:
                # operator
                while (stack and stack[-1] != '(' and
                       precedence[i] <= precedence.get(stack[-1], 0)):
                    postfix.append(stack.pop())
                stack.append(i)

        # Pop remaining operators
        while stack:
            postfix.append(stack.pop())

        return ''.join(postfix)


# Test
obj = Infix_to_Postfix()
eq = "a+b*(c^d-e)"
print(obj.cal(eq))





# Function to define precedence of operators
def precedence(op):
    if op in ('+', '-'):
        return 1
    if op in ('*', '/'):
        return 2
    if op == '^':
        return 3
    return 0

# Function to check if character is operand
def is_operand(ch):
    return ch.isalpha() or ch.isdigit()

# Main function to convert infix to postfix
def infix_to_postfix(expression):
    stack = []  # stack for operators
    result = ''  # output expression

    for ch in expression:
        if is_operand(ch):
            result += ch
        elif ch == '(':
            stack.append(ch)
        elif ch == ')':
            while stack and stack[-1] != '(':
                result += stack.pop()
            stack.pop()  # remove '(' from stack
        else:
            # Operator encountered
            while (stack and precedence(stack[-1]) >= precedence(ch)):
                result += stack.pop()
            stack.append(ch)

    # Pop remaining operators
    while stack:
        result += stack.pop()

    return result


# Example usage
expr = "A+(B*C-(D/E^F)*G)*H"
print("Infix Expression: ", expr)
print("Postfix Expression:", infix_to_postfix(expr))
