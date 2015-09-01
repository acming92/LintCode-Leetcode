public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
    	if(obstacleGrid == null) {
    		return 0;
    	}
    	int height = obstacleGrid.length;
    	if(height < 1) {
    		return 0;
    	}
    	int width = obstacleGrid[0].length;
    	int[][] map = new int[height + 1][width + 1];
    	for(int i = 0; i <= height; ++i) {
    		map[i][0] = 0;
    	}
    	for(int j = 0; j <= width; ++j) {
    		map[0][j] = 0;
    	}
    	if(obstacleGrid[0][0] == 1) {
    		return 0;
    	}
    	map[1][1] = 1;
    	for(int i = 1; i <= height; ++i) {
    		for(int j = 1; j <= width; ++j) {
    			if(i != 1 || j != 1) {
    				if(obstacleGrid[i - 1][j - 1] == 1) {
    					map[i][j] = 0;
     				} else {
     					map[i][j] = map[i - 1][j] + map[i][j - 1];
     				}
    			}
    		}
    	}
    	
    	return map[height][width];
    }
    
    public static void main(String[] args) {
    	
    }
}
