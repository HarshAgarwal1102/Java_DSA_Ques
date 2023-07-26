public class Solution {

    public static int sumAtKthLevel(TreeNode<Integer> root, int k) {

        // Write your code here
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum=0;
        while(k>0)
        {
            TreeNode tmp=q.remove();
            if(tmp==null)
            {
                q.add(null);
                k--;
                continue;
            }
            if(k==1)
            {
                sum+=(int)tmp.data;
            }
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
        return sum;
    }

}
