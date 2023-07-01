package dsa.string;

public class ReverseStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s = {"Sky", "is", "Blue"};
		int start = 0;
        int end = s.length -1;
        String temp = "";

        while(start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start ++;
            end --;
        }
        
        for(String s1 : s) {
        	System.out.print(s1+ " ");
        }
	}

}
