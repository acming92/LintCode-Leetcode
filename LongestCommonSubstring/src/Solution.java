public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
    	if(A == null || B == null) {
    		return 0;
    	}
    	int[][] dp = new int[A.length() + 1][B.length() + 1];
    	int max = 0;
    	for(int i = 1; i <= A.length(); ++i) {
    		for(int j = 1; j <= B.length(); ++j) {
    			if(A.charAt(i - 1) == B.charAt(j - 1)) {
    				dp[i][j] = dp[i - 1][j - 1] + 1;
    			} else {
    				dp[i][j] = 0;
    			}
    			if(dp[i][j] > max) {
    				max = dp[i][j];
    			}
    		}
    	}
    	
    	return max;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.longestCommonSubstring("ABCD", "CBCE"));
    }
}