def precedence(op):
    """Return precedence of operators"""
    if op == '+' or op == '-':
        return 1
    if op == '*' or op == '/':
        return 2
    if op == '^':  # exponent
        return 3
    return 0

def is_operator(c):
    return c in "+-*/^"

def infix_to_prefix(expression):
    # Reverse the infix expression
    expression = expression[::-1]
    
    # Swap '(' with ')' and vice versa
    expression = list(expression)
    for i in range(len(expression)):
        if expression[i] == '(':
            expression[i] = ')'
        elif expression[i] == ')':
            expression[i] = '('
    expression = ''.join(expression)
    
    stack = []
    prefix = []
    
    for char in expression:
        if char.isalnum():  # operand
            prefix.append(char)
        elif char == '(':
            stack.append(char)
        elif char == ')':
            while stack and stack[-1] != '(':
                prefix.append(stack.pop())
            stack.pop()  # pop '('
        else:  # operator
            while stack and precedence(char) < precedence(stack[-1]):
                prefix.append(stack.pop())
            stack.append(char)
    
    while stack:
        prefix.append(stack.pop())
    
    # Reverse to get the final prefix expression
    return ''.join(prefix[::-1])

# Example usage
expr = "(A-B/C)*(A/K-L)"
prefix_expr = infix_to_prefix(expr)
print("Prefix:", prefix_expr)
