package Stack;

import java.util.Stack;

public class minStack {
    private Stack<Integer> stack;    // Main stack to store all elements
    private Stack<Integer> minStack; // Stack to store the minimum values

    public static void main(String[] args) {
        minStack minStack = new minStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());  // Returns -3
        minStack.pop();
        System.out.println(minStack.top());     // Returns 0
        System.out.println(minStack.getMin());  // Returns -2
    }

    public minStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        int ans = minStack.peek();
        stack.pop();
        if (ans == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();

    }
}
