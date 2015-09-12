import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
    	if(nums == null || nums.size() == 0) {
    		return 0;
    	}
    	
    	int maxMum = -0xffffff;
    	int[] dp = new int[nums.size() + 1];
    	dp[0] = -0xffffff;
    	
    	for(int i = 1; i <= nums.size(); ++i) {
    		dp[i] = Math.max(dp[i - 1] + nums.get(i - 1), nums.get(i - 1));
    		if(dp[i] > maxMum) {
    			maxMum = dp[i];
    		}
    	}
    	
    	return maxMum;
    }
    
    public static void main(String[] args) {
    	
    }
}
