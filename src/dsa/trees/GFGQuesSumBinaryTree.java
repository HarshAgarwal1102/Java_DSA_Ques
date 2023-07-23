class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null){
            return 0;
        }
        int leftsum = sumBT(head.left);
        int rightsum = sumBT(head.right);
        
        return leftsum+rightsum+head.data;
    }
}
