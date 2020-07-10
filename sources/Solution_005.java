
class Solution_005 {
    public boolean isAnagram(String s, String t) {
        int[] bucket = new int[26];
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int index = 0; index < arr1.length; index++) {
            bucket[arr1[index] - 'a']++;
        }
        for(int index = 0; index < arr2.length; index++) {
            bucket[arr2[index] - 'a']--;
        }
        for(int item : bucket) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
}