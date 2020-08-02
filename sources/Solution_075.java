class Solution_075 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int min = 0;
        for(int i = 0; i < length;) {
            min += nums[i];
            i += 2;
        }
        return min;
    }
}