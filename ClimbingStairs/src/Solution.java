public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
    	int[] stair = new int[n + 1];
    	if(n <= 0) {
    		return 0;
    	}
    	if(n <= 1) {
    		return 1;
    	}
    	stair[0] = 1;
    	stair[1] = 1;
    	for(int i = 2; i <= n; ++i) {
    		stair[i] = stair[i - 1] + stair[i - 2];
    	}
    	
    	return stair[n];
    }
    
    public static void main(String[] args) {
    	
    }
}
