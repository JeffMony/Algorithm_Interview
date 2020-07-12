

public class Main {
    public static void main(String[] args) {
        Solution_022 instance = new Solution_022();
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] res = instance.plusOne(arr);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}