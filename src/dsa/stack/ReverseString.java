class GFG {
  
	public static void main(String[] args) {
		String s="Geeks For Geeks";
		Stack<Character> stack=new Stack<>();
		
		for(char c:s.toCharArray())
		{
			stack.push(c);
		}
		
		String temp="";
		
		while(!stack.isEmpty())
		{
			temp+=stack.pop();
		}
		System.out.println("Reversed string is : "+temp);
	}
}
