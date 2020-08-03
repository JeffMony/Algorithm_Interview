class Solution_083 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = res[1] = -1;
        int index = findNum(nums, target);
        if (index == -1) return res;
        int i = index;
        while(i >= 0 && nums[i] == target) i--;
        res[0] = i+1;
        i = index;
        while(i < nums.length && nums[i] == target) i++;
        res[1] = i-1;
        return res;
    }

    private int findNum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}