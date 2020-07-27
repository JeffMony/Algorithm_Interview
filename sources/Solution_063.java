import java.util.List;
import java.util.ArrayList;

class Solution_063 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(i++ < numRows) {
            res.add(new ArrayList<>());
        }
        for(i = 0; i < numRows; i++) {
            System.out.print(1);
            res.get(i).add(1);
            if (i >= 2) {
                List<Integer> temp = res.get(i-1);
                for (int j = 1; j < temp.size(); j++) {
                    int num1 = temp.get(j-1);
                    int num2 = temp.get(j);
                    res.get(i).add(num1 + num2);
                }
            }
            if (i == 0) {
                continue;
            }
            res.get(i).add(1);
        }
        return res;
    }
}