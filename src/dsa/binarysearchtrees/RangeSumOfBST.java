class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum =0;
        sumBST(root, low, high);
        return sum;
    }
    public void sumBST(TreeNode root, int low, int high){
        if(root==null) return;
        if(root.val>= low && root.val <=high) 
            sum +=root.val;
        if(root.val>low) 
            sumBST(root.left, low, high);
        if(root.val<high) 
            sumBST(root.right, low, high);
        
    }
}
