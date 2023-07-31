class Pair{
    int data;
    boolean isSum;
    Pair(int d,boolean i){
        data = d;
        isSum = i;
    }
}
class Tree
{
    private Pair checkBalance(Node root) {
        if (root == null)
            return new Pair(0, true);

        Pair left = checkBalance(root.left);
        Pair right = checkBalance(root.right);

        int height = Math.max(left.data, right.data) + 1;
        boolean balanced = left.isSum && right.isSum && Math.abs(left.data - right.data) <= 1;

        return new Pair(height, balanced);
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
    	Pair result = checkBalance(root);
        return result.isSum;
    }
}
