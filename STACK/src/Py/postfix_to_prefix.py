class PostfixToPrefix:
    def convert(self, eq):
        stack = []
        for ch in eq:
            if ch.isalnum():  # operand
                stack.append(ch)
            else:  # operator
                op1 = stack.pop()  # right operand
                op2 = stack.pop()  # left operand
                stack.append(ch + op2 + op1)  # prefix format
        return stack.pop()

# Example usage
obj = PostfixToPrefix()
eq = "AB-DE+F*/"
prefix_expr = obj.convert(eq)
print("Prefix:", prefix_expr)
