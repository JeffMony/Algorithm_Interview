import java.util.List;
import java.util.ArrayList;

class Solution_084 {

    //1.寻找x在数组中的位置
    //2.向左确定搜索的起始位置
    //3.累加求最值
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int index = findNum(arr, x);
        if (arr[index] != x) {
            if (index > 0 && (x-arr[index-1]<= arr[index]-x)) index = index-1;
        }
        int start = Math.max(0, index + 1 - k);
        List<Integer> tempList = new ArrayList<>();
        int min = 0;
        for(int i = start; i < start + k; i++) {
            tempList.add(i);
            min += Math.abs(arr[i] - x);
        }
        for (int i = start + k; i < arr.length; i++) {
            int temp = min - Math.abs(arr[i-k]-x) + Math.abs(arr[i]-x);
            if (temp < min) {
                tempList.remove(Integer.valueOf(i-k));
                tempList.add(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i : tempList) {
            System.out.println(arr[i]);
            res.add(arr[i]);
        }
        return res;
    }

    private int findNum(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}