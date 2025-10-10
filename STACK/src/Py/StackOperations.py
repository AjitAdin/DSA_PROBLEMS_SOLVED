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

# 
class Stack:
    def __init__(self):
        # Initialize an empty list to represent the stack
        self.stack = []

    # Push an item onto the stack
    def push(self, item):
        self.stack.append(item)
        print(f"Pushed {item} onto the stack.")
        self.print_stack()

    # Pop the top item from the stack
    def pop(self):
        if not self.is_empty():
            item = self.stack.pop()
            print(f"Popped {item} from the stack.")
        else:
            print("Stack is empty! Cannot pop.")
        self.print_stack()

    # Peek at the top item without removing it
    def peek(self):
        if not self.is_empty():
            print(f"Top item is: {self.stack[-1]}")
        else:
            print("Stack is empty! No top item.")

    # Check if the stack is empty
    def is_empty(self):
        return len(self.stack) == 0

    # Get the size of the stack
    def size(self):
        return len(self.stack)

    # Display the current stack
    def print_stack(self):
        if not self.is_empty():
            print("Current Stack:", self.stack)
        else:
            print("Stack is empty.")

# Example Usage
stack = Stack()

# Push items onto the stack
stack.push(10)
stack.push(20)
stack.push(30)

# Peek at the top item
stack.peek()

# Pop items from the stack
stack.pop()
stack.pop()

# Display the final stack state
stack.print_stack()

# Check if stack is empty
print("Is stack empty?", stack.is_empty())
