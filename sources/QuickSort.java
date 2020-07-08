
class QuickSort {
    public void quickSort(int[] array, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
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