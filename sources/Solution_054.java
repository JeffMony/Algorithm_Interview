class Solution_054 {
    public int[] countBits(int num) {
        int res[] = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            res[i] = count(i);
        }
        return res;
    }

    private int count(int x) {
        int count = 0;
        for(; x != 0;) {
            x &= (x-1);
            count++;
        }
        return count;
    }
}

/**
0
1    --->1

10
11   --->3

100
101
110
111  --->8

1000
1001
1010
1011
1100
1101
1110
1111 --->20

**/