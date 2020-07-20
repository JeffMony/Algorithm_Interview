class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSets = new HashSet<>();
        for (String str : wordList) {
            wordSets.add(str);
        }
        if (wordSets.size() == 0 || !wordSets.contains(endWord)) {
            return 0;
        }
        wordSets.remove(beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        //已经访问过的元素
        Set<String> visitedSet = new HashSet<>();
        visitedSet.add(beginWord);
        int count = 1;
        int length = beginWord.length();
        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            for(int i=0; i<queueSize; i++) {
                String tempStr = queue.poll();
                char[] charArr = tempStr.toCharArray();
                for (int j=0; j<length; j++) {
                    char sourceChar = charArr[j];
                    for(char k='a'; k<='z'; k++) {
                        if (k==sourceChar) {
                            continue;
                        }
                        charArr[j]=k;
                        String destStr = String.valueOf(charArr);
                        if (wordSets.contains(destStr)) {
                            if (destStr.equals(endWord)) {
                                return count+1;
                            }

                            if (!visitedSet.contains(destStr)) {
                                queue.offer(destStr);
                                visitedSet.add(destStr);
                            }
                        }
                    }
                    charArr[j] = sourceChar;
                }
                
            }
            count++;
        }
        return 0;
    }
}