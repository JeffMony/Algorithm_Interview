class Solution_024 {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] left = new int[length];
        int[] right = new int[length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < length; i++) {
            while(!stack.isEmpty() && (heights[stack.peek()] >= heights[i])) {
                stack.pop();
            }
            left[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();
        for (int i = length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && (heights[stack.peek()] >= heights[i])) {
                stack.pop();
            }
            right[i] = (stack.isEmpty()) ? length : stack.peek();
            stack.push(i);
        }

        int res = 0;
        for (int i = 0; i < length; i++) {
            int temp = (right[i] - left[i] - 1) * heights[i];
            res = Math.max(res, temp);
        }
        return res;
    }
}