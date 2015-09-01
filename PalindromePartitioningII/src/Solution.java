public class Solution {
    /**
     * @param s a string
     * @return an integer
     */
	
	public boolean[][] getIsPalindrome(String s) {
		boolean[][] isPal = new boolean[s.length()][s.length()];
		
		for(int i = 0; i < s.length(); ++i) {
			isPal[i][i] = true;
		}
		
		for(int i = 0; i < s.length() - 1; ++i) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				isPal[i][i + 1] = true;
			}
		}
		
		for(int length = 2; length < s.length(); ++length) {
			for(int j = 0; j  + length< s.length(); ++j) {
				isPal[j][j + length] = isPal[j + 1][j + length - 1] && s.charAt(j) == s.charAt(j + length);
			}
		}
		return isPal;
	}
	
    public int minCut(String s) {
        // write your code here
    	if(s == null) {
    		return 0;
    	}
    	if(s.length() <= 1) {
    		return 0;
    	}
    	boolean[][] isPal = getIsPalindrome(s);
    	int[] dp = new int[s.length() + 1];
    	
    	for(int i = 0; i <= s.length(); ++i) {
    		dp[i] = i - 1;
    	}
    	for(int i = 1; i <= s.length(); ++i) {
    		for(int j = 0; j < i; ++j) {
    			if(isPal[j][i - 1]) {
    				dp[i] = Math.min(dp[i], dp[j] + 1);
    			}
    		}
    	}
    	
    	return dp[s.length()];
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.minCut("aab"));
    }
};
