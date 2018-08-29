class MyStack {
    Queue<Integer> q1, q2;
    int top;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1){
            top = q1.poll();
            q2.offer(top);
        }
        int elem = q1.poll();
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
        return elem;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.peek() == null && q2.peek() == null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */