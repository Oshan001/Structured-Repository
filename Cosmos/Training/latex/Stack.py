class Stack:
    def __init__(self, size):
        self.size = size
        self.stack = [None] * size
        self.top = -1

    def push(self, item):
        if self.top == self.size - 1:
            print("STACK OVERFLOW")
        else:
            self.top += 1
            self.stack[self.top] = item
            print(item, "pushed into stack")

    def pop(self):
        if self.top == -1:
            print("STACK UNDERFLOW")
        else:
            item = self.stack[self.top]
            self.top -= 1
            print(item, "popped from stack")

    def peek(self):
        if self.top == -1:
            print("Stack is empty")
        else:
            print("Top element:", self.stack[self.top])

    def display(self):
        if self.top == -1:
            print("Stack is empty")
        else:
            print("Stack elements are:")
            for i in range(self.top, -1, -1):
                print(self.stack[i])
def main():
    size = int(input("Enter the size of stack: "))
    s = Stack(size)

    while True:
        print("\nStack Operations")
        print("1. Push")
        print("2. Pop")
        print("3. Display")
        print("4. Peek")
        print("5. Exit")

        choice = int(input("Enter your choice: "))

        match choice:
            case 1:
                item = input("Enter element to push: ")
                s.push(item)

            case 2:
                s.pop()

            case 3:
                s.display()

            case 4:
                s.peek()

            case 5:
                print("Exiting...")
                break

            case _:
                print("Invalid choice! Please try again.")

if __name__ == "__main__":
    main()