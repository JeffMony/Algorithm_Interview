class Solution_028 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        } else if (arr.length <= k) {
            return arr;
        }
        partitionArray(arr, 0, arr.length-1, k);
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    private void partitionArray(int[] arr, int lo, int hi, int k) {
        // 做一次 partition 操作
        int m = partition(arr, lo, hi);
        // 此时数组前 m 个数，就是最小的 m 个数
        if (k == m) {
            // 正好找到最小的 k(m) 个数
            return;
        } else if (k < m) {
            // 最小的 k 个数一定在前 m 个数中，递归划分
            partitionArray(arr, lo, m-1, k);
        } else {
            // 在右侧数组中寻找最小的 k-m 个数
            partitionArray(arr, m+1, hi, k);
        }
}

    private int partition(int[] a, int begin, int end) {
        int pivot = end;        //pivot: 标杆位置
        int counter = begin;   //counter: 小于pivot的元素的个数
        for (int i = begin; i < end; i++) {
            if (a[i] < a[pivot]) {
                int temp = a[counter]; 
                a[counter] = a[i]; 
                a[i] = temp;
                counter++;
            }
        }
        //将a[pivot]放到合适的位置
        int temp = a[pivot]; 
        a[pivot] = a[counter]; 
        a[counter] = temp;
        return counter;
    }
}