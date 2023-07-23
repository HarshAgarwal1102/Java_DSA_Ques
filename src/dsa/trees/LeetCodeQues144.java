class Solution {

    public void traversal(TreeNode root, List<Integer> res) {
        if(root == null) 
            return;

        res.add(root.val);
        traversal(root.left, res);
        traversal(root.right, res);
   }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        traversal(root, res);
        
        return res;
   }
}
