class Solution_051 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        if ((n & Integer.MIN_VALUE) != 0) {
            count = 1;
            n &= Integer.MAX_VALUE;
        }
        while( n != 0) {
            if ((n % 2) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}