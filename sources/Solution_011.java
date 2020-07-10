
class Solution_011 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        int low  = 0;
        int high = m * n -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int res = matrix[mid / n][mid % n];
            if (res == target) {
                return true;
            }
            if (res > target) {
                high = mid - 1;
            } else {
                low =  mid + 1;
            }
        }
        return false;
    }
}