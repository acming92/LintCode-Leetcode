public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
    	if(A == null) {
    		return true;
    	}
    	if(A.length < 2) {
    		return true;
    	}
    	boolean[] isJump = new boolean[A.length];
    	isJump[0] = true;
    	for(int i = 1; i < A.length; ++i) {
    		isJump[i] = false;
    		for(int j = 0; j < i; ++j) {
    			if(isJump[j] && j + A[j] >= i) {
    				isJump[i] = true;
    				break;
    			}
    		}
    	}
    	
    	return isJump[A.length - 1];
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {4,6,9,5,9,3,0};
    	System.out.println(String.valueOf(temp.canJump(A)));
    }
} 