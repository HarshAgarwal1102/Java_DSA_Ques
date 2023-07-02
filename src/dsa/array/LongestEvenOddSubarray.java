package dsa.array;

public class LongestEvenOddSubarray {
	public static long continuousSubarrays(int[] nums) {
		int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            int diff = 0;

            for (int j = i; j < n; j++) {
                diff = Math.abs(nums[j] - nums[i]);
                if (diff <= 2) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums1 = {5, 4, 2, 4};
        long count1 = continuousSubarrays(nums1);
        System.out.println("Example 1: " + count1);

        int[] nums2 = {1, 2, 3};
        long count2 = continuousSubarrays(nums2);
        System.out.println("Example 2: " + count2);

        int[] nums3 = {65, 66, 67, 66, 66, 65, 64, 65, 65, 64};
        long count3 = continuousSubarrays(nums3);
        System.out.println("Additional Example: " + count3);
    }
}
