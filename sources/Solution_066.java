class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int length = prices.length;
        int[] res = new int[length];
        for(int i = 0; i < length; i++) {
            res[i] = 0;
        }
        for(int i = 1; i < length; i++) {
            int temp = res[i-1] + (prices[i] - prices[i-1]);
            if (temp > 0) {
                res[i] = temp;
            } else {
                res[i] = 0;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++) {
            if (max < res[i]) {
                max = res[i];
            }
        }
        return max;
    }
}