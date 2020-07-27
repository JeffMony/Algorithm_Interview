import java.util.List;
import java.util.ArrayList;

class Solution_064 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(i++ < numRows) {
            res.add(new ArrayList<>());
        }
        for(i = 0; i < numRows; i++) {
            if (i == 0) {
                res.get(i).add(1);
                continue;
            }
            for(int j = 0; j <= i; j++) {
                if (j == 0) {
                    res.get(i).add(res.get(i-1).get(j));
                } else if (j == i) {
                    res.get(i).add(res.get(i-1).get(j-1));
                } else {
                    res.get(i).add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
        }
        return res;
    }
}