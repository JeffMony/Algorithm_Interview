public class Solution_053 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 31; n != 0; i--) {
            res += (n & 1) << i;
            n >>>= 1;
        }
        return res;
    }
}