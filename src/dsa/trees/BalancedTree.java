class Tree
{
    //Function to check whether a binary tree is balanced or not.
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        
        return Math.max(height(root.left), height(root.right) ) + 1 ;
        
    }
    
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(root==null)
            return true;
    
    
        int leftH = height(root.left);
        int rightH =height(root.right);
    
        int diff = Math.abs(leftH-rightH);
    
        return diff<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
