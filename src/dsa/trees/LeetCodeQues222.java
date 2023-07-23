class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
    
        int lh = countNodes(root.left);
        int rh = countNodes(root.right);
        
        return lh + rh + 1;
    }
}
