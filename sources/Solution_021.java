class Solution_021 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1 > num2) {
                nums1[k] = num1;
                i--;
            } else {
                nums1[k] = num2;
                j--;
            }
            k--;
        }
        while(i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}