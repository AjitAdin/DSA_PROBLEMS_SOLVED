from collections import deque

class StackUsingQueue:
    def __init__(self):
        self.q = deque()
        
    def push(self, ele):
        self.q.append(ele)
        # Rotate the queue so the last pushed element is at the front
        for _ in range(len(self.q) - 1):
            self.q.append(self.q.popleft())
    
    def pop(self):
        if self.is_empty():
            return -1   # consistent with top()
        return self.q.popleft()
    
    def top(self):
        if self.is_empty():
            return -1
        return self.q[0]
    
    def is_empty(self):
        return len(self.q) == 0


# Example usage
s = StackUsingQueue()
s.push(10)
s.push(20)
s.push(30)

print(s.pop())  # 30
print(s.pop())  # 20
print(s.top())  # 10
print(s.pop())  # 10
print(s.pop())  # -1 (stack empty)



# second method
from collections import deque

class StackUsingTwoQueues:
    def __init__(self):
        self.q1 = deque()  # main queue
        self.q2 = deque()  # helper queue

    def push(self, ele):
        # Step 1: Push to q2
        self.q2.append(ele)
        
        # Step 2: Move everything from q1 to q2
        while self.q1:
            self.q2.append(self.q1.popleft())
        
        # Step 3: Swap q1 and q2
        self.q1, self.q2 = self.q2, self.q1

    def pop(self):
        if self.is_empty():
            return -1
        return self.q1.popleft()

    def top(self):
        if self.is_empty():
            return -1
        return self.q1[0]

    def is_empty(self):
        return len(self.q1) == 0


# Example usage
s = StackUsingTwoQueues()
s.push(10)
s.push(20)
s.push(30)

print(s.pop())  # 30
print(s.top())  # 20
print(s.pop())  # 20
print(s.pop())  # 10
print(s.pop())  # -1 (empty)

