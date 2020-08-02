class Solution_073 {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        String res = "";
        for(String str  : strArr) { 
            str = reverse(str);
            res += str + " ";
        }
        return reverse(res.trim());
    }

    private String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}