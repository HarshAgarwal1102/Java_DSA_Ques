class Solution {
    public static TreeNode insert(TreeNode root, int key){
        if(root == null)
            return new TreeNode(key);
        
        if(root.val < key){
            root.right = insert(root.right, key);
        }
        else
            root.left = insert(root.left, key);
            
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node =new TreeNode(preorder[0]);
        
        for(int i=1;i<preorder.length;i++){
            insert(node,preorder[i]);
        }
        
        return node;
    }
}
