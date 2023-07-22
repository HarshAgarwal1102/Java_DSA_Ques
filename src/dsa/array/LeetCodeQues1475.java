class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            if(answer.length - 1 == i){
                answer[i] = prices[i];
                break;
            }
            for(int j= i + 1; j<prices.length; j++){
                if(prices[i] >= prices[j] ){
                    answer[i] = prices[i] - prices[j];
                    break;
                }
                else{
                    answer[i] = prices[i];
                }
            }
        }
        return answer;
    }
}
