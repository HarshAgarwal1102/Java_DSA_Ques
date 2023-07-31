class Tree
{
    int count=0;
    private void traverse(Node root)
    {
        if(root==null) return;
        
        traverse(root.left);
        if(root.left==null && root.right==null) count++;
        traverse(root.right);
    }
    int countLeaves(Node node) 
    {
         // Your code  
         traverse(node);
         return count;
    }
}
