import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here  
    	if(s == null || s.length() == 0) {
    		return true;
    	}
    	boolean[] dp = new boolean[s.length() + 1];
    	dp[0] = true;
    	for(int i = 1; i <= s.length(); ++i) {
    		for(int j = i - 30 > 0 ? i - 30: 0; j < i; ++j) {
    			if(dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
    		}
    	}
    	
    	return dp[s.length()];
    }
    
    public static void main (String[] args) {
    	Solution temp = new Solution();
    	Set<String> dict = new HashSet<String>();
    	dict.add("lint");
    	dict.add("code");
    	System.out.println(String.valueOf(temp.wordBreak("lintcode", dict)));
    }
}
