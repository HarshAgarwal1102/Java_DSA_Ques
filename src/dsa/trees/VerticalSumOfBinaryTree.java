class Solution{
    
    public void find(Node root,int hd,TreeMap<Integer,Integer> map){
        
        if(root==null) 
            return;
    
        if(!map.containsKey(hd)) 
            map.put(hd,root.data);
        else 
            map.put(hd,map.get(hd)+root.data);
            
        if(root.left!=null) 
            find(root.left,hd-1,map);
        if(root.right!=null) 
            find(root.right,hd+1,map);
    }
    
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        find(root,0,map);
        ArrayList<Integer> list = new ArrayList<>(map.values());
        
        return list;
    }
}
