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
    public TreeNode delete(TreeNode root,int tar)
    {
        if(root==null) return null;

          root.left=delete(root.left,tar);
          root.right=delete(root.right,tar);
        if((root.left==null && root.right==null) && root.val==tar)
        {
            return null;
        }
        else
        {
        return root;
        }

    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
      return delete(root,target);


        
    }
}