class Solution_038 {
    private List<List<Integer>> res = new ArrayList();
    int k;

    private void backTrace(int curIndex, ArrayList<Integer> curSet, int[] nums) {
        if (curSet.size() == k) {
            res.add(new ArrayList<>(curSet));
        }
        for(int i = curIndex; i < nums.length; i++) {
            curSet.add(nums[i]);
            backTrace(i+1, curSet, nums);
            curSet.remove(curSet.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (k = 0; k < n + 1; ++k) {
            backTrace(0, new ArrayList<Integer>(), nums);
        }
        return res;
    }
}