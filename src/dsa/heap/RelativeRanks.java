class Solution {
    public String[] findRelativeRanks(int[] score) {
        String arr[] = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }
        HashMap<Integer,String> map = new HashMap<>();
        int idx = 1;
        while(!pq.isEmpty()){
            if(idx==1){
                map.put(pq.remove(),"Gold Medal");
            }
            else if(idx ==2){
                map.put(pq.remove(),"Silver Medal");
            }
            else if(idx ==3){
                map.put(pq.remove(),"Bronze Medal");
            }
            else{
                map.put(pq.remove(),Integer.toString(idx));
            }
            idx++;
        }
        for(int i=0;i<score.length;i++){
            arr[i] = map.get(score[i]);
        }
        return arr;
    }
}
