package dsa.string;

public class AdjacentChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbcc";
		char ch = '*';
		String temp ="";
		
		for(int i = 0; i< str.length()-1; i+=2) {
			if((str.charAt(i)) == str.charAt(i+1)) {
				temp += str.charAt(i) + "*";
			}
			else
				temp+= str.charAt(i);
		}
		
		System.out.println(temp);
	}

}
