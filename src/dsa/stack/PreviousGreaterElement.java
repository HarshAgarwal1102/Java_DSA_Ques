package dsa.stack;

public class PreviousGreaterElement {
	static int[] func2(int []prices){
        int n = prices.length;
        int ans[] = new int[n];
        Stack stack = new Stack();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek() <= prices[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(prices[i]);
         }
         return ans;
    }
    public static void main(String[] args) {
        int prices[] = {60,50,40,85,90,60};
        int [] ans= func2(prices);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
