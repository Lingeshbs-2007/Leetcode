// Last updated: 8/11/2026, 8:57:02 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
  
class Solution {
    void inOrder(TreeNode root){ 
        if(root == null)
            return;
        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
    }
    List<Integer> l = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return l;
    }
}