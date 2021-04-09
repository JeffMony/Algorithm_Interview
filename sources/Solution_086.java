class Solution_086 {
    public char nextGreatestLetter(char[] letters, char target) {
        int index = find(letters, target);
        System.out.println("index = " + index);
        if (index == letters.length) return letters[0];
        return getchar(letters, index, target);
    }

    private char getchar(char[] letters, int start, char target) {
        if (letters[start] != target) return letters[start];
        int i = start;
        while(i < letters.length && letters[i] == letters[start]) {
            i++;
        }
        if (i >= letters.length) return letters[0];
        return letters[i];
    }

    private int find(char[] letters, char target) {
        int i = 0;
        int j = letters.length - 1;
        while(i <= j) {
            int mid = i + ((j-i) >> 1);
            if (letters[mid] == target) return mid;
            if (letters[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return i;
    }
}