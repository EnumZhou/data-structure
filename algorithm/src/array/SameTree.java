package array;

import model.TreeNode;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 */

public class SameTree {
    public static void main(String args[]) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        TreeNode p = new TreeNode(1,left,right);

        TreeNode q = new TreeNode(1,left,right);

        System.out.println(isSameTree(p,q));



    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);

    }
}