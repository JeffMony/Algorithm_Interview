class Solution_061 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int quick = 0;
        while(quick < nums.length) {
            if (nums[quick] != val) {
                nums[slow] = nums[quick];
                slow++;
            }
            quick++;
        }
        return slow;
    }
}