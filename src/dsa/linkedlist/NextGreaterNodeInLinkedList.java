class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        int n=0;
        while(head!=null){
            n++;
            l.add(head.val);
            head=head.next;
        }

        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=l.size()-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=l.get(i)){
                s.pop();
            }
            if(s.isEmpty()) ans[i]=0;
            else ans[i]=s.peek();
            s.push(l.get(i));
        }

        return ans;
        
    }
}
