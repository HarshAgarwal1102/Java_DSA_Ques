class Solution {
    
    ArrayList<String> ans = new ArrayList<>();
    int arr[][] ;
    
    public  ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<Character> list = new ArrayList<>();
        arr = m;
        solve(0, 0, n, list);
        return ans;
    }
    
    void solve(int r , int c , int n , List<Character> list ){
        
        if(arr[r][c] == 0) return;
        
        if(r == n-1 && c == n-1) {
            StringBuilder path = new StringBuilder();
            for(char ch: list) path.append(ch);
            ans.add(path.toString());
            return;
        }
        
        arr[r][c] = 0;
        if(r>0 ){;
            list.add('U');
           solve(r -1 , c, n, list);
           list.remove(list.size()-1);
           
        }
        if(r<n-1){
            list.add('D');
            solve(r +1 , c, n,list);
            list.remove(list.size()-1);
        }
        
        if(c>0){
            list.add('L');
            solve(r , c-1, n, list);
            list.remove(list.size()-1);
        }
        
        if(c<n-1){
            list.add('R');    
            solve(r , c+1, n, list);
            list.remove(list.size()-1);
        }
        arr[r][c]=1;
    }
}
