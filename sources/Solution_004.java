
class Solution_4 {
    public int lengthOfLastWord(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        boolean noBlank = false;
        char[] arr = s.toCharArray();
        int count = 0;
        for (int index = arr.length - 1; index >= 0; index--) {
            if (arr[index] == ' ') {
                if (noBlank) {
                    break;
                } else {
                    continue;
                }
            } else {
                noBlank = true;
                count++;
            }
        }
        return count;
    }
}