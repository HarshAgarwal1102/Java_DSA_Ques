class Solution {
    int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ countNodes(root.left)+ countNodes(root.right);
    }

    boolean isCBT(TreeNode root,int index, int totalCounts){
        if(root==null){
            return true;
        }
        if(index>=totalCounts){
            return false;
        }
        boolean left = isCBT(root.left, 2*index+1, totalCounts);
        boolean right = isCBT(root.right, 2*index+2, totalCounts);
        return (left&&right);
    }

    public boolean isCompleteTree(TreeNode root) {
        if(isCBT(root,0,countNodes(root))){
            return true;
        }
        else
            return false;
    }
}
