class PostfixToInfix:
    def cal(self, eq):
        stack = []
        for ch in eq:
            if ch.isalpha():         # If operand, push to stack
                stack.append(ch)
            else:                    # If operator, pop two operands
                op1 = stack.pop()    # Right operand
                op2 = stack.pop()    # Left operand
                stack.append("(" + op2 + ch + op1 + ")")  # Form new infix
        return stack.pop()

obj = PostfixToInfix()
eq = "AB-DE+F*/"
print(obj.cal(eq))
