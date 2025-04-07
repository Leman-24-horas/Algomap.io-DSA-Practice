class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
                
            } 
            stack.push(i); // push the index
        } 
        return result; // 80ms, 23.95%
    }
}

// better approach keep indices in the stack and use those indicies to get and compare values