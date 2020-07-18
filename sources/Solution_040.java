class Solution_040 {
    public int majorityElement(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    public int quickSort(int[] nums, int low, int high) {
        if (high <= low) {
            return nums[nums.length / 2];
        }
        int pivot = partition(nums, low, high);
        if (pivot == nums.length / 2) {
            return nums[pivot];
        } else if (pivot > nums.length / 2){
            quickSort(nums, low, pivot - 1);
            return nums[nums.length / 2];
        } else {
            quickSort(nums, pivot + 1, high);
            return nums[nums.length / 2];
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = high;
        int count = low;
        for(int i = low; i < high; i++) {
            if(nums[i] < nums[pivot]) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
         }
         int temp = nums[count];
         nums[count] = nums[pivot];
         nums[pivot] = temp;
         return count;
    }
}