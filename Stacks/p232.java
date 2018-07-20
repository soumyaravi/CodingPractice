class MyQueue {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    int first, last;
    /** Initialize your data structure here. */
    public MyQueue() {
        first = 0;
        last = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.empty() && s2.empty())
            first = x;
        while(!s1.empty())
            s2.push(s1.pop());
        s1.push(x);
        last = x;
        while(!s2.empty())
            s1.push(s2.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int top = s1.pop();
        if(!s1.empty())
            first = s1.peek();
        return top;
    }
    
    /** Get the front element. */
    public int peek() {
        return first;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.empty() && s2.empty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */