
import java.util.Stack;

class Solution_2 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if ( c == '(') {
                stack.push(')');
            } else if ( c == '[') {
                stack.push(']');
            } else if ( c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop() ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}