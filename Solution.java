



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int compareLength = (length + 1) / 2;
        int[] result = new int[compareLength + 1];
        System.out.println("compareLength = " +compareLength);
        int num1 = 0, num2 = 0;

        int i1 = 0, i2 = 0;
        int k = 0;

        while (i1 < nums1.length && i2 < nums2.length && k <= compareLength) {
            if (nums1[i1] < nums2[i2]) {
                result[k++] = nums1[i1++];
            } else {
                result[k++] = nums2[i2++];
            }
        }

        System.out.println("i1="+i1+", i2="+i2+", k="+k);

        while (i1 < nums1.length && k <= compareLength) {
            result[k++] = nums1[i1++];
        }

        while (i2 < nums2.length && k <= compareLength) {
            result[k++] = nums2[i2++];
        }

        for (int i = 0; i < compareLength + 1; i++) {
            System.out.println(result[i]);
        }

        if (length % 2 == 1) {
            return result[compareLength - 1];
        }
        return (result[compareLength] + result[compareLength - 1]) * 1.0 / 2;

    }
}