int findMinimumCost(string str) {
  	
    //odd condition
    if(str.length()%2 == 1) {
        return -1;
    }
    
    Stack<Character> s = new Stack<>();
    Char ch[] = str.chatAt();
    for(int i=0; i<str.length(); i++) {        
        if(ch[i] == '{') 
            s.push(ch[i]);
		else
        {
            //ch is closed brace
            if(!s.empty() && s.peek() == '{') {
                s.pop();
            }
            else
            {
                s.push(ch[i]);
            }
        }
    }
    
        //stack contains invalid expression
        int a = 0, b = 0;
        while(!s.empty()) {
            if(s.peek() == '{') {
                b++;
            }
            else
            {
                a++;
            }
            s.pop();
        }
        
		int ans = (a+1)/2 + (b+1)/2;
        return ans;
}
