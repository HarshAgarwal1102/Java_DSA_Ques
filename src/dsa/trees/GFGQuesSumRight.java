class Solution{
    static int result;
    public int rightLeafSum(Node root) 
    { 
        result = 0;

        task(root.left, false);
        task(root.right, true);

        return result;
    }

    static void task(Node root, boolean flag){
        if(root == null) 
            return;

        if(flag && root.left==null && root.right==null) 
            result += root.data;

        task(root.left, false);
        task(root.right, true);
    }
}
