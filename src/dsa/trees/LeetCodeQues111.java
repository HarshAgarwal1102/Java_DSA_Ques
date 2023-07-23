class Solution {
  public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int left_height = minDepth(root.left);
        int right_height = minDepth(root.right);
        if(left_height==0 || right_height == 0){
            return Math.max(left_height,right_height)+1;
        }
        return Math.min(right_height,left_height)+1;
    }
}
