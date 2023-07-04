package dsa.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "lists";
		String str2= "listen";
		String str3= "likes";
		
		String str = "";
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str2.charAt(i) && str2.charAt(i)==str3.charAt(i)) {
				str = str + str1.charAt(i);
			}
		}
		
		System.out.println(str);
	}

}
