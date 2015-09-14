public class Solution {
	/**
	 * @param A : An integer array
	 * @return : An integer 
	 */
    public int singleNumberII(int[] A) {
        // write your code here
    	
    	if(A == null || A.length == 0) {
    		return 0;
    	}
    	
    	int[] bitCount = new int[32];
    	
    	for(int i = 0; i < A.length; ++i) {
    		for(int j = 0; j < 32; ++j) {
    			if((A[i] & (1 << j)) > 0) {
    				bitCount[j]++;
    			}
    		}
    	}
    	
    	int result = 0;
    	
    	for(int i = 0; i < 32; ++i) {
    		if(bitCount[i] % 3 != 0) {
    			result += 1 << i;
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {1,1,2,3,3,3,2,2,4,1};
    	System.out.println(temp.singleNumberII(A));
    }
}
