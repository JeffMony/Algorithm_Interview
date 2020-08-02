class Solution_076 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while(i < j) {
            if (numbers[i] + numbers[j] == target)
                break;
            else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        res[0] = i + 1;
        res[1] = j + 1;
        return res;
    }
}