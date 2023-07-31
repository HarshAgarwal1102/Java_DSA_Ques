class Solution {
    public class Info {
        int diam;
        int ht;
        
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    
    public Info diameterHelper(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        
        Info leftInfo = diameterHelper(root.left);
        Info rightInfo = diameterHelper(root.right);
        
        int diam = Math.max(Math.max(rightInfo.diam, leftInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        
        return new Info(diam, ht);
    }
    
    public int diameter(Node root) {
        return diameterHelper(root).diam;
    }
}
