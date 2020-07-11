class Solution_014 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        int target = 0;
        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && (nums[first] == nums[first - 1])) {
                continue;
            }
            target = -nums[first];
            int second = first + 1;
            int third = nums.length - 1;
            for (; second < nums.length; second++) {
                if (second > first + 1 && (nums[second] == nums[second - 1])) {
                    continue;
                }
                while(second < third && (nums[second] + nums[third]) > target) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if(nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}