
class Solution_1 {
    
    public int maxArea(int[] height) {
        if (height.length < 1) {
            return -1;
        }
        int i = 0;
        int j = height.length - 1;
        int res = -1;
        while(i < j) {
            int h = (height[i] > height[j]) ? height[j] : height[i];
            int tempRes = h * (j - i);
            res = (res > tempRes) ? res : tempRes;
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}