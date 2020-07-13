

public class Main {
    public static void main(String[] args) {
        Solution_025 instance = new Solution_025();
        int[] arr = new int[]{7,2,4};
        int[] res = instance.maxSlidingWindow(arr, 2);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}