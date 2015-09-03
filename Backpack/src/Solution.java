public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
    	if(m == 0) {
    		return 0;
    	}
    	if(A == null || A.length == 0) {
    		return 0;
    	}
    	
    	int[][] dp = new int[A.length + 1][m + 1];
    	for(int i = 1; i <= A.length; ++i) {
    		for(int j = 1; j <= m; ++j) {
    			if(A[i - 1] > j) {
    				dp[i][j] = dp[i - 1][j];
    			} else {
    				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - A[i - 1]] + A[i - 1]);
    			}
    		}
    	}
    	
    	return dp[A.length][m];
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {3,4,8,5};
    	System.out.println(temp.backPack(10, A));
    }
}
