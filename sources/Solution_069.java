import java.util.Queue;
import java.util.LinkedList;

class Solution_069 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        while(i < nums.length) {
            while(queue.size() <= k && i < nums.length) {
                if (queue.contains(nums[i])) {
                    return true;
                } else {
                    queue.offer(nums[i]);
                    i++;
                }
            }
            queue.poll();
        }
        return false;
    }
}