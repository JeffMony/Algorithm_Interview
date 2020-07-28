class Solution_067 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int length = prices.length;
        if (length == 2 && prices[1] > prices[0]) {
            return prices[1]-prices[0];
        }
        int max = 0;
        int start = 0;
        boolean setStart = false;
        for(int i = 0; i < length-1; i++) {
            if (prices[i] >= prices[i+1]) {
                if (i == 0) {
                    continue;
                }
                if (prices[i] > prices[start] && setStart) {
                    max += prices[i] - prices[start];
                }
                setStart = false;
            } else {
                if (!setStart) {
                    start = i;
                    setStart = true;
                }
                if (i+1 == length - 1 && prices[i+1] > prices[start]) {
                    max += prices[i+1] - prices[start];
                    break;
                }
            }
        }
        return max;
    }
}