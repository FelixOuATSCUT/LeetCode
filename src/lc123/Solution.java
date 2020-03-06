package lc123;

public class Solution {
    public static int maxProfit(int[] prices) {
        //贪心法
        if (prices == null || prices.length == 0)
            return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += (prices[i] - prices[i - 1]);
        }
        return profit;
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

