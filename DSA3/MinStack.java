class MinStack {
 Stack<Integer> normalSt;
        Stack<Integer> minimumValueSt;

        public MinStack() {
            normalSt = new Stack<>();
            minimumValueSt = new Stack<>();
        }
        
        public void push(int val) {
            if(normalSt.size() == 0){
                normalSt.push(val);
                minimumValueSt.push(val);
            }else{
                int min = Math.min(val, minimumValueSt.peek());
                normalSt.push(val);
                minimumValueSt.push(min);
            }
        }
        
        public void pop() {
            normalSt.pop();
            minimumValueSt.pop();
        }
        
        public int top() {
            return normalSt.peek();
        }
        
        public int getMin() {
            // o(1)
            return minimumValueSt.peek();
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
