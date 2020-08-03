class Solution_082 {

    //特别考虑到细节的情况
    //1.在数组边界怎么办
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        return findPeakElement(nums, 0, nums.length - 1);
    }

    private int findPeakElement(int[] nums, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int length = nums.length;
        if (mid == 0 && mid + 1 < length && nums[mid] > nums[mid+1]) {
            return mid;
        }
        if (mid == length - 1 && mid - 1 >= 0 && nums[mid-1] < nums[mid]) {
            return mid;
        }
        if (mid - 1 >= 0) {
            if (mid + 1 < length) {
                if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1])
                    return mid;
                int res1 = findPeakElement(nums, start, mid-1);
                if (res1 != -1) return res1;
                int res2 = findPeakElement(nums, mid+1, end);
                if (res2 != -1) return res2;
            }
            return findPeakElement(nums, start, mid-1);

        } else {
            return findPeakElement(nums, mid+1, end);
        }
    }
}