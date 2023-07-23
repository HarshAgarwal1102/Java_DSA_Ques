class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)
        {
            return 0;
        }

        int left_height= height(node.left);
        int right_height = height(node.right);
        int result = Math.max(left_height,right_height)+1;
        
        return result;
    }
}
