
class CompSort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        for (int i = 0; i < arr1.length; i++)
            bucket[arr1[i]]++;

        int idx = 0;
        for (int i = 0; i < arr2.length; i++)
            while (bucket[arr2[i]] > 0) {
                bucket[arr2[i]]--;
                arr1[idx++] = arr2[i];
            }

        for (int i = 0; i < bucket.length; i++)
            while (bucket[i] > 0) {
                bucket[i]--;
                arr1[idx++] = i;
            }

        return arr1;
    }
}