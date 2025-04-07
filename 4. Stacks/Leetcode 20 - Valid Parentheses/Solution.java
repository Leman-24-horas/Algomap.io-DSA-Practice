class Solution {
    public boolean isValid(String s) {
        
        char[] arr = s.toCharArray();
        int n = arr.length;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            char c = arr[i];
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.empty()) {
                    return false;
                }
                
                char top = stack.peek();
                if(top == '(' && c != ')') {
                    return false;
                } else if (top == '[' && c != ']') {
                    return false;
                } else if (top == '{' && c != '}') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}

// if there is a perfect match then stack should be 0
// the brackets are either next to each other
// away from each other by a multiple of 2