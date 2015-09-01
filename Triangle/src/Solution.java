import java.util.ArrayList;

public class Solution {
	
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here
    	int n = triangle.size();
    	if(n < 1) {
    		return 0;
    	}
    	int[][] map = new int[n + 1][n + 1];
    	for(int i = 0; i <= n; ++i) {
    		map[i][0] = 0;
    	}
    	map[1][1] = triangle.get(0).get(0);
    	for(int i = 1; i <= n; ++i) {
    		for(int j = 1; j <= i; ++j) {
    			if(i != 1 || j != 1) {
        			map[i][j] = Math.min(map[i - 1][j], map[i - 1][j - 1]) + triangle.get(i - 1).get(j - 1);
    			}
    		}
    	}
    	
    	return map[n][n];
    }
    
    public static void main(String[] args) {
    	
    }
}
