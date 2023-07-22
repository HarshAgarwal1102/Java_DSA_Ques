class Solution
{ 
    static void insertAtBottom(Stack<Integer> s, int num){
        if(s.size()==0){
            s.push(num);
            return;
        }
        int n = s.peek();
        s.pop(); 
        insertAtBottom(s, num);
        s.push(n);
    } 
    static void reverse(Stack<Integer> s)
    {
       if(s.size()==0){  
           return;
       }
       int num=s.peek();
       s.pop();
       reverse(s);
       insertAtBottom(s, num);
    }
}
