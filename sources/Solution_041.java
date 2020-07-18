class Solution_041 {
    private TreeNode res = null;

    private boolean hasNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean leftHasNode = hasNode(root.left, p, q);
        boolean rightHasNode = hasNode(root.right, p, q);
        if ((leftHasNode && rightHasNode) || ((leftHasNode || rightHasNode) && (root.val == p.val || root.val == q.val))) {
            res = root;
        }
        return (leftHasNode || rightHasNode) || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        hasNode(root, p, q);
        return res;
    }
}