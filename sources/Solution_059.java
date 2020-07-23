class Solution_059 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = 0;
            }
        }
        for(int i  = 0; i < n; i++) {
            res[m-1][i] = triangle.get(m-1).get(i);
        }
        for(int i = m-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                res[i][j] = triangle.get(i).get(j) + Math.min(res[i+1][j], res[i+1][j+1]);
            }
        }
        return res[0][0];
    }
}