class Solution {
    
    void solve(int index , int[] nums , List<Integer> subset, List<List<Integer>> result){

        if(index >= nums.length ){
            result.add(new ArrayList<>(subset));
            return;
        }

        //for the current element 
        subset.add(nums[index]);
        solve(index +1, nums, subset, result);

        //exclude the current element
        subset.remove(subset.size() - 1 );
        solve(index +1, nums, subset, result);

    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums,new ArrayList<>(), result);

        return result ;
    }
}
