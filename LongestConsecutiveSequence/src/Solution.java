import java.util.HashMap;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public int longestConsecutive(int[] num) {
        // write you code here
    	if(num == null || num.length == 0) {
    		return 0;
    	}
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i : num) {
    		map.put(i, 0);
    	}
    	
    	int max = 0;
    	
    	for(int i : num) {
    		if(map.get(i) == 1) {
    			continue;
    		}
    		
    		int count = 1;
    		
    		int iter = i;
    		
    		while(map.containsKey(iter + 1)) {
    			count++;
    			iter++;
    			map.put(iter, 1);
    		}
    		
    		iter = i;
    		while(map.containsKey(iter - 1)) {
    			count++;
    			iter--;
    			map.put(iter, 1);
    		}
    		
    		max = Math.max(max, count);
    	}
    	
    	return max;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {100, 4, 200, 1, 3, 2};
    	System.out.println(temp.longestConsecutive(A));
    }
}