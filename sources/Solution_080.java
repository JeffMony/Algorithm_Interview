//   nums[i ~ j]   中比nums[i-1]小的值

class Solution_080 {
    public int findUnsortedSubarray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= nums.length - 2 && high >= 1 && low < high) {
            if (nums[low] > nums[high]) {
                break;
            }
            if (nums[low] <= nums[high]) {
                if (nums[low] <= nums[low+1]) {
                    low++;
                } else if (nums[high-1] <= nums[high]) {
                    high--;
                } else {
                    break;
                }
            }
        }
        System.out.println(low +", " + high);
        if (low == high) {
            return 0;
        }
        return (high - low + 1);
    }
}