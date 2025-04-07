class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1;
        int r = maxArr(piles); // maximum value in array

        while(l < r) {
            int m = l + ((r-l)/2);
            if(kWorks(m, piles, h)) {
                r = m;
            } else {
                l = m+1;
            }
        }
        return l; // 20ms, 55.46%
    }

    public static boolean kWorks(int k, int[] piles, int h) {
        double h1 = 0;
        for (int i : piles) {
            double div = (double) i / k;
            h1 += Math.ceil(div);
        }
        if (h1 <= h)
            return true;
        return false;
    }

    public static int maxArr(int[] piles) {
        int max = -1;
        for(int i : piles) {
            max = Math.max(max, i);
        }
        return max;
    }
}