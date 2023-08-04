class Solution {
    public static TreeNode inorderSuccessor(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        else { 
            //case 1  ---> while both node null
            if(root.left == null && root.right == null) {
                return null;
            }

            //case - 2  -----> while a single node is null
            else if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case - 3  -----> while it has both nodes
            else { 
                TreeNode ios = inorderSuccessor(root.right);
                root.val = ios.val;
                root.right = deleteNode(root.right, ios.val);
            } 
        }
        return root;
    }
}
