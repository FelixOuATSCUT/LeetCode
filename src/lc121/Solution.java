package lc121;

public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 0) return 0;
        int minp = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            // 找出最小的买入值
            if (prices[i] < minp) {
                minp = prices[i];
            }
            if (prices[i] - minp > 0) {
                ans = Math.max(ans, prices[i] - minp);
            }
        }
        return ans;
    }

    public static void main(String[] s) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {1, 2};
        int[] nums3 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(nums));
        System.out.println(maxProfit(nums2));
        System.out.println(maxProfit(nums3));
    }
}

