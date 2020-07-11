

public class Main {
    public static void main(String[] args) {
        Solution_020 instance = new Solution_020();
        int[] arr = new int[]{1,2};
        int k = 2;
        instance.rotate(arr, k);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}