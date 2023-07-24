class Solution {
    public static List<Integer> intersection(int[][] nums) {
        int[] temp = new int[1001];
        List<Integer> ans = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                temp[i]++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == nums.length) ans.add(i);
        }
        return ans;
    }
}
