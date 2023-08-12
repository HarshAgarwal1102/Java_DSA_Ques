class Solution {
    public TreeNode bstToGst(TreeNode root) {
        recurse(root,0);
        return root;
    }
    public int recurse(TreeNode root, int sum){
        if(root == null)
            return 0;

        if(root.right != null)
            sum = recurse(root.right,sum);

        int a = root.val;
        root.val = root.val + sum;
        sum += a;
        if(root.left != null)
            sum = recurse(root.left,sum);

        return sum;
    }
}
