class Solution_039 {
    public int mySqrt(int x) {
        double res = (double)x;
        while(Math.abs(res - (res + x / res) / 2) >= 0.01) {
            res = (res + x / res) / 2;
        }
        return (int)res;
    }
}