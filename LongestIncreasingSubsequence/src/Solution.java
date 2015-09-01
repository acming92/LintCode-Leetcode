public class Solution {

    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
    	if(nums == null) {
    		return 0;
    	}
    	
    	if(nums.length == 0) {
    		return 0;
    	}
    	
    	if(nums.length == 1) {
    		return 1;
    	}
    	
    	int[] dp = new int[nums.length];
    	dp[0] = 1; 
    	int max = 0;
    	for(int i = 1; i < nums.length; ++i) {
    		dp[i] = 1;
    		for(int j = 0; j < i; ++j) {
    			if(nums[j] <= nums[i]) {
    				dp[i] = Math.max(dp[i], dp[j] + 1);
    			}
    		}
    		if(dp[i] > max) {
    			max = dp[i];
    		}
    	}
    	
    	return max;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] nums = {4, 2, 4, 5, 3, 7};
    	System.out.println(temp.longestIncreasingSubsequence(nums));
    }
}
