class Solution {
    ArrayList<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        return list;  
    }
    public void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
