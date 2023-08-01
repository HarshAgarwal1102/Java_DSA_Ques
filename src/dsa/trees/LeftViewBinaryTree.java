class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i< size; i++){
                Node top = q.poll();
                if(i == 0){
                    ans.add(top.data);
                }
                
                if(top.left!=null) 
                    q.add(top.left);
                
                if(top.right!=null)
                    q.add(top.right);
            }
        }
        
        return ans;
    }
}
