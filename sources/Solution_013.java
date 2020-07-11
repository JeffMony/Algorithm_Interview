class Solution_013 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int num1;
        int num2 = 1;
        int res = 2;
        for(int index = 3; index <= n; index++) {
            num1 = num2;
            num2 = res;
            res = num1 + num2;
        }
        return res;
    }
}