package dsa.string;

import java.util.Stack;

public class ReverseStringV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s = {"Let's take LeetCode contest"};
		
		Stack<String> st = new Stack<>();
		
		for(String s1 : s) {
        	st.push(s1);
        }
		String result = "";
		while(!st.isEmpty()) {
			result += st.pop() + " ";
			result.trim();
		}
		System.out.print(result +" ");
	}

}
