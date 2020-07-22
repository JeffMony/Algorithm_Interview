class Solution_058 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return 0;
        }
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        int[][] res = new int[arr1.length+1][arr2.length+1];
        for(int i = 0; i <= arr1.length; i++) {
            for(int j = 0; j <= arr2.length; j++) {
                res[i][j] = 0;
            }
        }
        for(int i = 1; i <= arr1.length; i++) {
            for(int j = 1; j <= arr2.length; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    res[i][j] = res[i-1][j-1] + 1;
                } else {
                    res[i][j] = Math.max(res[i-1][j], res[i][j-1]);
                }
            }
        }
        return res[arr1.length][arr2.length];
    }
}