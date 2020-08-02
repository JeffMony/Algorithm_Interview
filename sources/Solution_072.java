class Solution_072 {
    public String longestPalindrome(String s) {
        String temp = "@";
        int length = s.length();
        for(int i = 0; i < length; i++) {
            temp += s.charAt(i) + "@";
        }
        char[] arr = temp.toCharArray();
        int[] res = new int[arr.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = 0;
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <= i && i + j < arr.length; j++) {
                if (i - j == i + j) {
                    continue;
                }
                if (arr[i-j] == arr[i+j]) {
                    res[i]++;
                } else {
                    break;
                }
            }
            if (max < res[i]) {
                max = res[i];
                index = i;
            }
        }
        String str = "";
        for(int i = index - max; i < index + max; i++) {
            if ('@' != arr[i]) {
                str += String.valueOf(arr[i]);
            }
        }
        return str;
    }
}