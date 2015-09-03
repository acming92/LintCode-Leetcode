import java.util.ArrayList;

public class Solution {
    /**
     * @param A: An integer array.
     * @param target: An integer.
     */
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {
        // write your code here
    	if(A == null || A.size() == 0) {
    		return 0;
    	}
    	int[][] dp = new int[A.size() + 1][101];
    	for(int i = 1; i <= A.size(); ++i) {
    		for(int j = 1; j <= 100; ++j) {
    			int min = 0xffffff;
    			for(int k = 1; k <= 100; ++k) {
    				if(absoluteValue(j - k) <= target) {
    					int temp = dp[i - 1][k];
    					if(temp < min) {
    						min = temp;
    					}
    				}
    			}
    			dp[i][j] = min + absoluteValue(j - A.get(i - 1));
    		}
    	}
    	int minimum = 0xffffff;
    	for(int i = 1; i <= 100; ++i) {
    		if(dp[A.size()][i] < minimum) {
    			minimum = dp[A.size()][i];
    		}
    	}
    	
    	return minimum;
    }
    
    public int absoluteValue(int a) {
    	if(a < 0) {
    		return -a;
    	} else {
    		return a;
    	}
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(1);
    	A.add(4);
    	A.add(2);
    	A.add(3);
    	System.out.println(temp.MinAdjustmentCost(A, 1));
    }
}
