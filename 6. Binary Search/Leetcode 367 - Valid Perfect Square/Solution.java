class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while(l <= r) {
            long m = l + (r-l)/2; // same as (l+r)/2
            long sq = m*m; // use long because this number gets too big
            if(sq == num) {
                return true;
            } else if(sq < num) {
                l = (int) m+1;
            } else {
                r = (int) m-1;
            }
        }
        return false;
    }
}