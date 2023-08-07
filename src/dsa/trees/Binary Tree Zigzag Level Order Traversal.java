class Solution {
    public static void levelTraversal(TreeNode root, List<List<Integer>> finalList){
        if(root == null){
            return ;
        }
        Queue <TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0; i< size; i++){
                TreeNode front = q.poll();
    
                if(front.left != null){
                    q.offer(front.left);
                }
                if(front.right != null){
                    q.offer(front.right);
                }
                list.add(front.val);
            }
            if(flag != true){
                Collections.reverse(list);
            }
            finalList.add(list);
            flag = !flag;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();

        levelTraversal(root, finalList);

        return finalList;
    }
}
