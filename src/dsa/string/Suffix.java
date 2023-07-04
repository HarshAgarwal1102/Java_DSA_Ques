package dsa.string;

public class Suffix {
	public static void suf(String str) {
		String result = "";
		for(int i = str.length()-1; i>=0; i--) {
			result = str.charAt(i) + result;
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suf("apple");
	}

}
