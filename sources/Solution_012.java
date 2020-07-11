class Solution_012 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int slow = 0;
        int quick = slow + 1;
        while(quick <= nums.length - 1) {
            if (nums[slow] != 0) {
                slow++;
                quick = slow + 1;
            } else {
                if (nums[quick] == 0) {
                    quick++;
                } else {
                    int temp = nums[slow];
                    nums[slow] = nums[quick];
                    nums[quick] = temp;
                }
            }
        }
    }
}