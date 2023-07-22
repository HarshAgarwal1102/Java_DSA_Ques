class Solution {
    int checkRedundancy(String s) {
        Stack<Character>stk = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i] =='(' || ch[i] =='+' || ch[i] =='-' || ch[i] =='/' || ch[i] =='*'){
                stk.push(ch[i]);
            }
            else{
                if(ch[i]==')')
                {
                    boolean isRedundant=true;
                    while(stk.peek()!='('){
                        if(stk.peek()=='+' || stk.peek()=='/' || stk.peek()=='*' || stk.peek()=='-'){
                            isRedundant=false;
                        }
                        stk.pop();
                    }
                    if(isRedundant==true){
                        return 1;
                    }
                    stk.pop();
                }
            }
        }
        return 0;
    }
}
