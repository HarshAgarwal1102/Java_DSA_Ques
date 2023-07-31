class Solution
{
	int getSum(Node node) {
        if (node == null) {
            return 0;
        }

        int sum = node.data+getSum(node.left) + getSum(node.right);
        return sum;
    }    
	boolean isSumTree(Node root)
	{
        // Your code here
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        
        if(root.data == leftSum+rightSum  && isSumTree(root.left) && isSumTree(root.right)){
            return true;
        }
  
        return false;
	}
}
