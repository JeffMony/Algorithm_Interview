

public class Main {
    public static void main(String[] args) {
        Solution_032 instance = new Solution_032();
        java.util.List<String> res = instance.generateParenthesis(3);
        for(String str : res) {
            System.out.println(str);
        }
    }
}