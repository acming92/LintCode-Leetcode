import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
    	if(nums == null || nums.size() == 0) {
    		return 0;
    	}
    	
    	int minMum = 0xffffff;
    	int[] dp = new int[nums.size() + 1];
    	dp[0] = 0xffffff;
    	
    	for(int i = 1; i <= nums.size(); ++i) {
    		dp[i] = Math.min(dp[i - 1] + nums.get(i - 1), nums.get(i - 1));
    		if(dp[i] < minMum) {
    			minMum = dp[i];
    		}
    	}
    	
    	return minMum;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {1, -1, -2, 1};
    	ArrayList<Integer> input = new ArrayList<Integer>();
    	for(int i = 0; i < A.length; ++i) {
    		input.add(A[i]);
    	}
    	System.out.println(temp.minSubArray(input));
    }
}

