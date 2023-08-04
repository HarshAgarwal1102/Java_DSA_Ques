class Solution
{
    int count = 0;
    private void solve(Node root,int k,ArrayList<Integer> list){
        if(root==null)
            return;
        
        list.add(root.data);
        
        int sum=0;
        int size = list.size();
        for(int i = size-1; i>=0; i--){
            sum += list.get(i);
            if(sum==k)
                count++;
        }
        solve(root.left,k,list);
        solve(root.right,k,list);
        list.remove(list.size()-1);
    }
    
    public int sumK(Node root,int k)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        solve(root,k,list);
        
        return count;
    }
}
