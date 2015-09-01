public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
    	if(m < 0 || n < 0) {
    		return 0;
    	}
    	int[][] map = new int[m + 1][n + 1];
    	for(int i = 0; i <= m; ++i) {
    		map[i][0] = 0;
    	}
    	for(int i= 0; i <= n; ++i) {
    		map[0][i] = 0;
    	}
    	map[1][1] = 1;
    	for(int i = 1; i <= m; ++i) {
    		for(int j = 1; j <= n; ++j) {
    			if(i != 1 || j != 1) {
        			map[i][j] = map[i - 1][j] + map[i][j - 1];
    			}
    		}
    	}
    	
    	return map[m][n];
    }
    
    public static void main(String[] args) {
    	
    }
}

