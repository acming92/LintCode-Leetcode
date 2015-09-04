package kSum;

public class Solution {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return an integer
     */
    public int kSum(int A[], int k, int target) {
        // write your code here
    	if(A == null) {
    		return 0;
    	}
    	int[][] dp = new int[A.length + 1][target + 1];
    	
    	for(int i = 0; i <= A.length; ++i) {
    		for(int j = 0; j <= target; ++j) {
    			dp[i][j] = -1;
    		}
    	}
    	
    	for(int j = 1; j <= A.length; ++j) {
    		for(int i = 1; i <= target; ++i) {
    			if(j == A[i - 1]) {
    				dp[i][j] = 1;
    			}
    			else if(j >= A[i - 1]) {
    				if(dp[i][j - A[i - 1]] != 0) {
    					dp[i][j] = dp[i][j - A[i - 1]] + 1;
    				}
    			}
    		}
    	}
    	
    	int num = 0;
    	
    	for(int i = 0; i <= A.length; ++i) {
    		if(dp[i][target] == k) {
    			num++;
    		}
    	}
    	
    	return num;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {1, 2, 3, 4};
    	System.out.println(temp.kSum(A, 2, 5));
    }
}
