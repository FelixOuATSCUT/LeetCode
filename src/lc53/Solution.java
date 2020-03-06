package lc53;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }

    public static void main(String[] s) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {-2, 1, -3, 4,5};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }
}

