class Solution_019 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int quick = slow + 1;
        for(; quick < nums.length; quick++) {
            if (nums[slow] != nums[quick]) {
                nums[slow + 1] = nums[quick];
                slow++;
            }
        }
        return slow + 1;
    }
}