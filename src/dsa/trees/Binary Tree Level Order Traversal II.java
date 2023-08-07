class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root==null){
            return wrapList;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++){
                TreeNode temp=q.poll();
                subList.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            wrapList.add(subList);
        }

        Collections.reverse(wrapList);

        return wrapList;
    }
}
