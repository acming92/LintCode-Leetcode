public class Solution {
    /**
     * @param s: A string 
     * @param p: A string includes "?" and "*"
     * @return: A boolean
     */
    public boolean isMatch(String s, String p) {
        // write your code here
    	
    	if(s == null && p == null) {
    		return true;
    	}
    	
    	if(s == null || p == null) {
    		return false;
    	}
    	
    	boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    	
    	dp[0][0] = true;
    	
    	for(int i = 1; i <= p.length(); ++i) {
    		if(p.charAt(i - 1) == '*') {
    			dp[0][i] = dp[0][i - 1];
    		}
    	}
    	
    	for(int i = 1; i <= s.length(); ++i) {
    		for(int j = 1; j <= p.length(); ++j) {
    			if(p.charAt(j - 1) == '*') {
    				dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
    			} else {
    				if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
    					dp[i][j] = dp[i - 1][j - 1];
    				} else {
    					dp[i][j] = false;
    				}
    			}
    		}
    	}
    	
    	return dp[s.length()][p.length()];
     }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.isMatch("aab", "c*a*b"));
    }
}