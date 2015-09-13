class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
    	
    	if(prices == null || prices.length == 0) {
    		return 0;
    	}
    	
    	int profit = 0;
    	
    	for(int i = 1; i < prices.length; ++i) {
    		int diff = prices[i] - prices[i - 1];
    		if(diff > 0) {
    			profit += diff;
    		}
    	}
    	
    	return profit;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] input = {2,1,2,0,1};
    	System.out.println(temp.maxProfit(input));
    }
};
