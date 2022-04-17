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
// class Solution {
//     //Approach 1: In-Order Traversal using ArrayList as a stack
//     public TreeNode increasingBST(TreeNode root) {
//         List<Integer> vals = new ArrayList();
//         inorder(root, vals);
//         TreeNode ans = new TreeNode(-1), cur = ans;
//         for(int v : vals) {
//             cur.right = new TreeNode(v);
//             cur = cur.right;
//         }
//         return ans.right;
        
//     }
//     public void inorder(TreeNode node, List<Integer> vals) {
//         if(node == null) return;
//         inorder(node.left, vals);
//         vals.add(node.val);
//         inorder(node.right, vals);
//     }   
    
// }

//Approach 2: Traversal with Relinking
class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }
}