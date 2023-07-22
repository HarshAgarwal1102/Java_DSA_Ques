class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    public boolean knows(int M[][],int a,int b,int n)
    {
           if(M[a][b]==1)
            return true;
           else
            return false;
    }
    int celebrity(int M[][], int n)
    {
        // code here 
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<n;i++)
       {
           st.push(i);
       }
       
       while(st.size()>1)
       {
             int a=st.pop();
             int b=st.pop();
             
             if(knows(M,a,b,n))
             {
                   st.push(b);
             }
             else{
                  st.push(a);
             }
       }
       int ans=st.pop();
       int zeroCount=0;
       int oneCount=0;
       for(int i=0;i<n;i++)
       {
             if(M[ans][i]==0)
             zeroCount++;
       }
       for(int i=0;i<n;i++)
       {
              if(M[i][ans]==1)
              oneCount++;
       }
       
       if(zeroCount==n && oneCount==n-1)
        return ans;
       else
        return -1;
    }
}
