public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
    	if(grid == null) {
    		return 0;
    	}
    	
    	int height = grid.length;
    	if(height < 1) {
    		return 0;
    	}
    	int width = grid[0].length;
    	
    	int[][] map = new int[height + 1][width + 1];
    	for(int i = 0; i <= height; ++i) {
    		map[i][0] = 0xfffff;
    	}
    	for(int j = 0; j <= width; ++j) {
    		map[0][j] = 0xffffff;
    	}
    	map[1][1] = grid[0][0];
    	for(int i = 1; i <= height; ++i) {
    		for(int j = 1; j <= width; ++j) {
    			if(i != 1 || j != 1) {
        			map[i][j] = Math.min(map[i - 1][j], map[i][j - 1]) + grid[i - 1][j - 1];
    			}
    		}
    	}
    	
    	return map[height][width];
    }
    
    public static void main(String[] args) {
    	
    }
}
