# strivers   O(2n)  space =O(2n)
class QueueUsingStack:
    def __init__(self):
        self.s1 = []  # For enqueue
        self.s2 = []  # For dequeue

   
    def enqueue(self,ele):
       while(self.s1):
           self.s2.append(self.s1.pop())
       
       
       self.s1.append(ele)
       while(self.s2):
           self.s1.append(self.s2.pop())
    def dequeue(self):
        if not self.s1:
            return None
        return self.s1.pop()
    def front(self):
       if not self.s1:
           return -1
       return self.s1[-1]

# Example usage
q = QueueUsingStack()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
print(q.front())    # 1
print(q.dequeue())  # 1
print(q.front())    # 2
q.enqueue(4)
q.enqueue(5)
q.enqueue(6)   #
print(q.dequeue())  
print(q.front()) 
print(q.dequeue())  
print(q.front()) 




class QueueUsingStack:
    def __init__(self):
        self.stack1 = []  # For enqueue
        self.stack2 = []  # For dequeue

    def enqueue(self, x):
        self.stack1.append(x)

    def dequeue(self):
        if not self.stack2: # if there are some elements in s2 then transfer is done so skip this step  (it can be via fron or dequeue function )
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        if not self.stack2:
            return "Queue is empty"
        return self.stack2.pop()

    def front(self):
        if not self.stack2:  # if there are some elements in s2 then transfer is done so skip this step 
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        if not self.stack2:
            return "Queue is empty"
        return self.stack2[-1]  # Peek the top of stack2 without removing

# Example usage
q = QueueUsingStack()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
print(q.front())    # 1
print(q.dequeue())  # 1
print(q.front())    # 2
q.enqueue(4)
q.enqueue(5)
q.enqueue(6)
print(q.front())    #
print(q.dequeue())  
print(q.dequeue())  
print(q.dequeue())  
