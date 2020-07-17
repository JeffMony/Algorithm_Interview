class Solution_037 {
    public double myPow(double x, int n) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1.0 / (customPow(x, -(n + 1)) * x) ;
            }
            return 1.0 / customPow(x, -n);
        }
        return customPow(x, n);
    }

    private double customPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double num = myPow(x, n/2);
        return num * num  * myPow(x, n - n/2 * 2);
    }}