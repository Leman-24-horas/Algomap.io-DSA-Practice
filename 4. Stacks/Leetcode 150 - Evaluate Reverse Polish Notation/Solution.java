class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String token : tokens) {
            String s = "+-*/";
            
            if(!s.contains(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int r = stack.pop();
                int l = stack.pop();

                switch(token) {
                    case "+":
                        stack.push(l+r);
                        break;
                    case "-":
                        stack.push(l-r);
                        break;
                    case "/":
                        int division = l/r;
                        if(division < 0) {
                            division = (int) Math.ceil(division);
                        } else {
                            division = (int) Math.floor(division);
                        }
                        stack.push(division);
                        break;
                    case "*":
                        stack.push(l*r);
                        break;
                }
            }
        }

        return stack.pop(); // 5ms, 97.81%
    }
}
