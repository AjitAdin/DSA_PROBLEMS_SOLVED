class CircularQueue:
    def __init__(self, capacity):
        self.capacity = capacity
        self.queue = [None] * capacity
        self.front = -1
        self.rear = -1

    # Check if queue is empty
    def isEmpty(self):
        return self.front == -1

    # Check if queue is full
    def isFull(self):
        return (self.rear + 1) % self.capacity == self.front

    # Add element to queue
    def enqueue(self, value):
        if self.isFull():
            print("Queue Overflow! Cannot enqueue", value)
        else:
            if self.front == -1:  # first element
                self.front = 0
            self.rear = (self.rear + 1) % self.capacity
            self.queue[self.rear] = value
            print(f"Enqueued {value}")

    # Remove element from queue
    def dequeue(self):
        if self.isEmpty():
            print("Queue Underflow! Cannot dequeue")
            return None
        value = self.queue[self.front]
        if self.front == self.rear:  # only one element
            self.front = self.rear = -1
        else:
            self.front = (self.front + 1) % self.capacity
        return value

    # Peek front element
    def peek(self):
        if self.isEmpty():
            print("Queue is empty")
            return None
        return self.queue[self.front]

    # Print current queue elements
    def print_queue(self):
        # print(self.queue)
        if self.isEmpty():
            print("Queue is empty")
            return
        print("Queue:", end=" ")
        i = self.front
        while True:
            print(self.queue[i], end=" ")
            if i == self.rear:
                break
            i = (i + 1) % self.capacity
        print()


# Example usage
q = CircularQueue(5)
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.enqueue(40)
q.enqueue(50)   # full now
q.print_queue()

print("Dequeued:", q.dequeue())
print("Dequeued:", q.dequeue())
q.print_queue()

q.enqueue(60)   # now reuses slot at front
q.enqueue(70)
q.print_queue()

print("Front element:", q.peek())



# class Queue:
    def __init__(self):
        self.q = []

    # Add element to the queue (rear side)
    def enqueue(self, ele):
        self.q.append(ele)
        print(f"Enqueued: {ele}")

    # Remove element from the queue (front side)
    def dequeue(self):
        if len(self.q) == 0:
            print("Queue is empty! Cannot dequeue.")
            return None
        removed = self.q.pop(0)  # remove first element
        print(f"Dequeued: {removed}")
        return removed

    # Print the current queue
    def print_q(self):
        if len(self.q) == 0:
            print("Queue is empty.")
        else:
            print("Current Queue:", self.q)


# Example usage
obj = Queue()
obj.enqueue(2)
obj.enqueue(64)
obj.enqueue(7)
obj.enqueue(1)

obj.print_q()   # Output: [2, 64, 7, 1]

obj.dequeue()   # Removes 2
obj.print_q()   # Output: [64, 7, 1]
