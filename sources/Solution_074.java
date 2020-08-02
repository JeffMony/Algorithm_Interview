class Solution_074 {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0 || s.length == 1) {
            return;
        }
        int i = 0;
        int j = s.length - 1;
        while(i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}