/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//要充分利用儿茶搜索树的特征来完成本题目
class Solution {
    public int closestValue(TreeNode root, double target) {
        double nap = root.val - target;
        if (Math.abs(nap) < 0.001) {
            System.out.println("root = " + root.val);
            return root.val;
        }
        //1.如果root.val 大于 target,那么最接近的值只有可能在左子树或者root上面
        if (nap > 0) {
            if (root.left != null) {
                int leftVal = closestValue(root.left, target);
                System.out.println("leftVal = " + leftVal);
                return Math.abs(leftVal-target) > Math.abs(nap) ? root.val : leftVal;
            }
            return root.val;
        }
        //2.如果root.val 小于 target,那么最接近的值只有可能在右子树或者root上面
        if (root.right != null) {
            int rightVal = closestValue(root.right, target);
            System.out.println("rightVal = " + rightVal);
            return Math.abs(rightVal-target) > Math.abs(nap) ? root.val : rightVal;
        }
        return root.val;
    }
}