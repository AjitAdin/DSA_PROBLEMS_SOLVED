class Stack:
    def __init__(self, capacity):
        self.capacity = capacity
        self.stack = [None] * capacity
        self.top = -1

    # Print current stack elements only
    def print_stack(self):
        if self.top == -1:
            print("Stack is empty")
        else:
            print("Stack:", self.stack[:self.top + 1])
            print("2nd  ",self.stack)

    # Push element
    def push(self, ele):
        if self.top == self.capacity - 1:
            print("Stack Overflow! Cannot push", ele)
        else:
            self.top += 1
            self.stack[self.top] = ele

    # Pop element
    def pop(self):
        if self.top == -1:
            print("Stack Underflow!")
            return None
        else:
            data = self.stack[self.top]
            self.stack[self.top] = None
            self.top -= 1
            return data

    # Peek element
    def peek(self):
        if self.top == -1:
            print("Stack is empty")
            return None
        return self.stack[self.top]


# Example usage
stack = Stack(3)
stack.print_stack()

stack.push(5)
stack.push(4)
stack.push(1)
print("Top element:", stack.peek())
stack.push(154)  # Overflow
stack.print_stack()

print("Popped:", stack.pop())
stack.print_stack()

print("Top element:", stack.peek())
