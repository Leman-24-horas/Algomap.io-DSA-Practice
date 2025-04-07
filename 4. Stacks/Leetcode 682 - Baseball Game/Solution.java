class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack = new Stack();
       int pts = 0;

       for(String s : operations) {
            if(s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                int newVal = stack.peek() * 2;
                stack.push(newVal);
            } else if (s.equals("+")) {
                int l = stack.pop();
                int r = stack.pop();
                int sum = l + r;
                stack.push(r);
                stack.push(l);
                stack.push(sum);
            } else {
                int val = Integer.valueOf(s);
                stack.push(val);
            }
       } 

       for(int i : stack) {
            pts += i;
       }
       return pts; // 3ms 49.22%
    }
}