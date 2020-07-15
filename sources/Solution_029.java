class Solution_029 {
    public int nthUglyNumber(int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[n];
        res[0] = 1;
        for (int index = 1; index < n; index++) {
            int n1 = res[i] * 2;
            int n2 = res[j] * 3;
            int n3 = res[k] * 5;
            int min = Math.min(Math.min(n1, n2), n3);
            res[index] = min;
            if (min == n1) {
                i++;
            }
            if (min == n2) {
                j++;
            }
            if (min == n3) {
                k++;
            }
        }
        return res[n - 1];
    }
}