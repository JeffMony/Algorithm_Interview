

public class Main {
    public static void main(String[] args) {
        MergeSort instance = new MergeSort();
        int[] arr = new int[]{3,6,8,1,2,9,0,7};
        instance.mergeSort(arr, 0, arr.length-1);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}