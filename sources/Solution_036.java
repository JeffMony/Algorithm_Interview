class Solution_036 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minHeight = Integer.MAX_VALUE;
        if (root.left != null) {
            minHeight = Math.min(minHeight, minDepth(root.left));
        }
        if (root.right != null) {
            minHeight = Math.min(minHeight, minDepth(root.right));
        }
        return minHeight + 1;
    }
}