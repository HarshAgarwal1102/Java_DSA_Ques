class Solution {
    public int maximumCount(int[] nums) {

        int cP=0;
        int cN=0;

        for(int i:nums){
            if(i>0) cP++;
            else if(i<0)cN++;
        }

        return Math.max(cP,cN);
        
    }
}
