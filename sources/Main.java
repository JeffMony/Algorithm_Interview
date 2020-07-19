import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_044 instance = new Solution_044();
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> res = instance.permute(nums);
        for(List<Integer> list : res) {
            System.out.println(list);
        }
    }
}