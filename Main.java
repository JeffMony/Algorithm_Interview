
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0,0};
        int[] nums2 = new int[]{0,0};

        Solution instance = new Solution();
        double result = instance.findMedianSortedArrays(nums1, nums2);
        System.out.println("result="+result);
    }
}