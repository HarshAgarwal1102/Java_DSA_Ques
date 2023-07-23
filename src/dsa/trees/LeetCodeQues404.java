class Solution {

    static int result;
    public int sumOfLeftLeaves(TreeNode root) {
        result = 0;

        task(root.left, true);
        task(root.right, false);

        return result;
    }

    static void task(TreeNode root, boolean flag){
        if(root == null) 
            return;

        if(flag && root.left==null && root.right==null) 
            result += root.val;

        task(root.left, true);
        task(root.right, false);
    }
}
