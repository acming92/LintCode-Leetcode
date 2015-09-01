public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
    	if(A == null) {
    		return 0;
    	}
    	if(A.length <= 1) {
    		return 0;
    	}
    	int[] count = new int[A.length];
    	count[0] = 1;
    	for(int i = 1; i < A.length; ++i) {
    		int min = 0xffffff;
    		for(int j = 0; j < i; ++j) {
    			if(j + A[j] >= i) {
    				if(count[j] + 1 < min) {
    					min = count[j] + 1;
    				}
    			}
    		}
    		count[i] = min;
    	}
    	
    	return count[A.length - 1];
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {2,3,1,1,4};
    	System.out.println(temp.jump(A));
    }
}
