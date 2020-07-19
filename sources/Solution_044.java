import java.util.List;
import java.util.LinkedList;

class Solution_044 {
    private List<List<Integer>> res = new LinkedList<>();
    private int length;

    public List<List<Integer>> permute(int[] nums) {
        length = nums.length;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int num : nums) {
            array.add(num);
        }
        backTrack(array, 0);
        return res;
    }

    private void backTrack(ArrayList<Integer> array, int first) {
        if (first == length) {
            res.add(new LinkedList<>(array));
        }
        for(int index = first; index < array.size(); index++) {
            Collections.swap(array, first, index);
            backTrack(array, first+1);
            Collections.swap(array, index, first);
        }
    }
}