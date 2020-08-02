class Solution_077 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int j = i;
        int sum = 0;
        for (; j < nums.length && i <= j;) {
            sum += nums[j];
            if (sum < s) {
                j++;
                //只有确定使用j这个位置的值时才会j++
            } else {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i++];
                sum -= nums[j];
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }
}