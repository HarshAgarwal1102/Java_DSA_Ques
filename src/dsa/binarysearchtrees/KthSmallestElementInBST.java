class Solution {
    int i = 1;     
    int ans = 0;

    public void inorder(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        
        inorder(root.left, k);

        if(i==k){
            ans = root.val;  
        }
        i++;      
        inorder(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);

        return ans;
    }
}
