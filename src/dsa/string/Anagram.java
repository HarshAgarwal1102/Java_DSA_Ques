package dsa.string;

import java.util.Arrays;

public class Anagram {
	
	static void approach1(String wordArr[]) {
		String words[] = wordArr.clone();
		int index = 0;
		for(String word : words) {
			char arr[] = word.toCharArray();
			Arrays.sort(arr);
			words[index] = String.valueOf(arr);
			index++;
		}
		
		for(int i = 0; i< words.length; i++) {
			if((i<words.length - 1) && words[i].equals(words[i+1])) {
				System.out.println(wordArr[i] +" "+ wordArr[i+1]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordArr[] = {"cat", "act", "tea", "eat"};
		approach1(wordArr);
	}

}
