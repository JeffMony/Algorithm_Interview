/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution_081 {
    public long firstBadVersion(long n, long s) {
        long i = 1;
        long j = n;
        while(i <= j) {
            long mid = (i+j)/2;
            System.out.println(mid);
            if (mid == 1 && isBadVersion(mid,s)) {
                return (int)mid;
            }
            if (isBadVersion(mid,s)) {
                if (!isBadVersion(mid-1, s)) {
                    return (int)mid;
                }
                j = mid-1;
            } else {
                i=mid+1;
            }
        }
        return 0;
    }

    private boolean isBadVersion(long num, long s) {
        return num == s;
    }
}