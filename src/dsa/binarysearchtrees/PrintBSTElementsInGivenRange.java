class Solution
{   
    //Function to return a list of BST elements in a given range.
    public static void print(Node root,int low,int high, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        print(root.left, low, high, ans);
        
        if(root.data >= low && root.data <= high){
            ans.add(root.data);
        }
        
        print(root.right, low, high, ans);
    }
    
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer> ans=new ArrayList<Integer>();
        print(root, low, high, ans);
        
        return ans;
    }
}
