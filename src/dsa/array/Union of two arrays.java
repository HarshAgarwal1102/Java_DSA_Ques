class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< a.length; i++){
            if(map.containsKey(a[i])){
                continue;
            }
            else{
                map.put(a[i], 1);
            }
        }
        for(int i=0; i< b.length; i++){
            if(map.containsKey(b[i])){
                continue;
            }
            else{
                map.put(b[i], 1);
            }
        }
        
        return map.size();
    }
}
