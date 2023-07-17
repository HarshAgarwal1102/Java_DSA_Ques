class GivenABinaryTreeConvertItIntoItsMirrorImage{
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code her
       Mirror(node);
    }
    void Mirror(Node node){
        if(node==null){
            return;
        }
        if(node.left!=null&&node.right!=null){
            Node temp=node.left;
        node.left=node.right;
        node.right=temp; 
        }
        else if(node.left==null&&node.right!=null){
            node.left=node.right;
            node.right=null;
        }
        else if(node.left!=null&&node.right==null){
           node.right= node.left;
            node.left=null;
        }
        Mirror(node.left);
        Mirror(node.right);
    }
}
