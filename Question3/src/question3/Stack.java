
package question3;


public class Stack {
    
    int[] stack;
    int top;

    Stack() {
        stack = new int[100];
        top = -1;
    }

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("stack is full");
        } else {
            top++;
            stack[top] = item;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int item = stack[top];
            top--;
            return item;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[top];
            return x;
        }
    }

    boolean contains(int i) {
        boolean search = false;
        int temp;
        for (int j = 0; j < stack.length; j++) {
            temp = stack[i];
            if (temp == i) {
                search = true;
            }

        }
        return search;
    }
}
