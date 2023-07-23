class Spiral
{
    //Function to return a list containing the level order 
    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        ArrayList<Integer> finalResult = new ArrayList<>();
        if(root==null)
            return finalResult;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean flag=true;
        List<Integer> levelTraversal = new ArrayList<>();
        while(q.size()>1){
            Node curr = q.poll();
            if(curr == null){
                if(flag){
                    Collections.reverse(levelTraversal);
                }
                finalResult.addAll(levelTraversal);
                flag =!flag;
                levelTraversal.clear();
                q.add(null);
                continue;
            }
            else{
                levelTraversal.add(curr.data);
                if(curr.left!= null)    
                    q.add(curr.left);
                if(curr.right!= null)    
                    q.add(curr.right);
            }
        }
        if(flag){
            Collections.reverse(levelTraversal);
        }
        finalResult.addAll(levelTraversal);
        return finalResult;
    }
}
