
class Solution_003 {
    public String toLowerCase(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }
        char[] arr = str.toCharArray();
        int gap = (int)('A' - 'a');
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] >= 'A' && arr[index] <= 'Z') {
                arr[index] = (char)(arr[index] - gap); 
            }
            sb.append(arr[index]);
        }
        return sb.toString();
    }
}