class Tree{
    public static void func(Node root,ArrayList<Integer>list,ArrayList<ArrayList<Integer>>result){
        if(root==null){
            return;
        }
 
        list.add(root.data);
        if(root.left==null&&root.right==null){
            result.add(new ArrayList(list));
        }
        func(root.left,list,result);
        func(root.right,list,result);
        list.remove(list.size()-1);
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>>result = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        
        if(root==null)
            return result;
 
        func(root,list,result);
        return result;
    }
}
