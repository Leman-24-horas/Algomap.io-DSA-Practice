class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> m;

    public MinStack() {
        s = new Stack<>();
        m = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(m.empty()) {
            m.push(val);
        } else if (val < m.peek()) {
            m.push(val);
        } else if (val >= m.peek()) {
            m.push(m.peek());
        }
        
    }
    
    public void pop() {
        s.pop();
        m.pop();
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */