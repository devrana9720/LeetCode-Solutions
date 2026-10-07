class MinStack {
    Stack<Integer> mainst = new Stack<>();
    Stack<Integer> minst = new Stack<>();

    public MinStack() {
       
    }
    
    public void push(int value) {
        mainst.push(value);
        if (minst.isEmpty() || value <= minst.peek()) {
            minst.push(value);
        }

    }
    
    public void pop() {
        int x=mainst.pop();
        if (x == minst.peek()) {
            minst.pop();
        }
    }
    
    public int top() {
         return mainst.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */