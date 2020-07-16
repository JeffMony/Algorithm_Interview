class Solution_034 {
    public boolean isValidBST(TreeNode root) {
        double temp = -Double.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= temp) {
                return false;
            }
            temp = root.val;
            root = root.right;
        }
        return true;
    }
}