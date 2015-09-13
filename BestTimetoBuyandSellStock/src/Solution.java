public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
    	if(prices == null || prices.length == 0) {
    		return 0;
    	}
    	
    	int min = Integer.MAX_VALUE;
    	int profit =  0;
    	
    	for(int i = 0; i < prices.length; ++i) {
    		min = prices[i] < min ? prices[i] : min;
    		profit = Math.max(profit, prices[i] - min);
    	}
    	
    	return profit;
    }
        
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] input = {3,2,3,1,2};
    	System.out.println(temp.maxProfit(input));
    }
}