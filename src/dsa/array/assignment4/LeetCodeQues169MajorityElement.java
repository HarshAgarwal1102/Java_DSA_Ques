package dsa.array.assignment4;

public class LeetCodeQues169MajorityElement {
	public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == majority){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
        }
        
        return majority;
    }
	
	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
		int ans = majorityElement(arr);
		System.out.println("Majority Occuring Element is "+ans);
	}
}

// Using Hash Map

/*

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int size = n / 2;

        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > size){
                return m.getKey();
            }
        }

        return 0;
    }
}

*/
