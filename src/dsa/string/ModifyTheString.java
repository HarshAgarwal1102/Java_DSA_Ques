package dsa.string;

import java.util.Stack;

public class ModifyTheString {

    public static String getString(String input) {
        Stack<Character> st = new Stack<>();
        int[] vis = new int[26];
        int[] cnt = new int[26];
        
        int n = input.length();
        
        for (int i = 0; i < n; i++) {
            cnt[input.charAt(i) - 'a']--;
            if (vis[input.charAt(i) - 'a'] != 0) {
                continue;
            }
            
            while (!st.isEmpty() && st.peek() < input.charAt(i) && cnt[st.peek() - 'a'] != 0) {
                vis[st.peek() - 'a'] = 0;
                st.pop();
            }
            
            st.push(input.charAt(i));
            vis[input.charAt(i) - 'a'] = 1;
        }
        
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.peek());
            st.pop();
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String input = "abacba";
        String result = getString(input);
        System.out.println(result);
    }
}