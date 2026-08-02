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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li = new ArrayList<>();
        if(root!=null){
            recursion(li,"",root);
        }
        return li;
    }
    void recursion(List<String> li,String s,TreeNode root){
        if(root.left==null && root.right==null){
            li.add(s+root.val);
            return;
        }

        s=s+root.val+"->";
        if(root.left!=null){
            recursion(li,s,root.left);
        }
        if(root.right!=null){
            recursion(li,s,root.right);
        }
    }
}