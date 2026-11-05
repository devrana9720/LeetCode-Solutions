import java.util.Stack;

class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {

    }
    public void push(int x) {
        st2.push(x);
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        Stack<Integer> temp = st1;
        st1 = st2;
        st2 = temp;
    }
    public int pop() {
        return st1.pop();
    }
    public int peek() {
        return st1.peek();
    }
    public boolean empty() {
        return st1.isEmpty();
    }
}