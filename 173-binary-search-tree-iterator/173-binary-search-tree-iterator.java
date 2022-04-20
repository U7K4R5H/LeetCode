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
class BSTIterator {
    
    ArrayList<Integer> ls = new ArrayList();

    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        return ls.remove(0);
    }
    
    public boolean hasNext() {
        return !ls.isEmpty();
    }
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        ls.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */