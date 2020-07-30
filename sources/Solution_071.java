class Solution_071 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;
        int k = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (k == i) {
                    max += k / 2;
                } else {
                    max += (k-1) / 2;
                }
                k = 0;
            } else {
                k++;
            }
        }
        if (k == flowerbed.length) {
            if (k == 1) {
                max = 1;
            } else {
                max += (k + 1) / 2;
            }
        } else {
            max += k / 2;
        }
        return max >= n;
    }
}