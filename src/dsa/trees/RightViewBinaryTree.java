class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode top = q.poll();
                if(i == size-1){
                    ans.add(top.val);
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
