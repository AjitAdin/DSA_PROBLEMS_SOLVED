class PrefixToInfix:
    def convert(self, expr):
        stack = []
        # Process from right to left
        for ch in expr[::-1]:
            if ch.isalnum():  # operand
                stack.append(ch)
            else:  # operator
                op1 = stack.pop()  # left operand
                op2 = stack.pop()  # right operand
                stack.append(f"({op1}{ch}{op2})")  # combine in infix
        return stack.pop()

# Example usage
obj = PrefixToInfix()
expr = "/-AB*+DEF"
infix_expr = obj.convert(expr)
print("Infix:", infix_expr)
