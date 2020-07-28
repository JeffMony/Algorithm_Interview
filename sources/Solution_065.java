class Solution_065 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return new ArrayList<>();
        }
        if (rowIndex == 1) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }
        if (rowIndex == 2) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            res.add(1);
            return res;
        }
        List<Integer> lastList = getRow(rowIndex - 1);
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i < lastList.size(); i++) {
            res.add(lastList.get(i-1) + lastList.get(i));
        }
        res.add(1);
        return res;
    }
}