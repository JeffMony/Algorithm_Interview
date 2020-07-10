class Solution_6 {
    int s;

    public int mySqrt(int x) {
        s=x;
        if(x==0) {
            return 0;
        }
        return ((int)(sqrts(x)));
    }

    private double sqrts(double x){
        double res = (x + s / x) / 2;
        if (Math.abs(res - x) < 0.000001) {
            return x;
        } else {
            return sqrts(res);
        }
    }
}