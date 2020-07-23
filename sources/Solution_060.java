class Solution_060 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int preMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preMaxSum = (nums[i] > preMaxSum + nums[i]) ? nums[i] : (preMaxSum + nums[i]);
            max = (max > preMaxSum) ? max : preMaxSum;
        }
        return max;
    }
}