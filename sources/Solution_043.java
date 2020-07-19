class Solution_043 {
    private List<List<Integer>> res = new LinkedList<>();
    private int k;
    private int n;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backTrack(1, new LinkedList<>());
        return res;

    }

    private void backTrack(int first, LinkedList<Integer> cur) {
        if (cur.size() == k) {
            res.add(new LinkedList<>(cur));
        }
        for(int index = first; index < n + 1; index++) {
            cur.add(index);
            backTrack(index + 1, cur);
            cur.removeLast();
        }
    }
}