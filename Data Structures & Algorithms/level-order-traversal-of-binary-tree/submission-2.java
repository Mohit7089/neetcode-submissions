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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
 
        while(!q1.isEmpty())
        {
            List<Integer> list1=new ArrayList<>();
            int size=q1.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q1.poll();
                list1.add(curr.val);
                if(curr.left!=null) q1.add(curr.left);
                if(curr.right!=null) q1.add(curr.right);
            }
            list.add(list1);
             
        }
        return list;
    }
}