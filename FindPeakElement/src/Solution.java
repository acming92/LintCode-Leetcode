class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
    	if(A == null || A.length <= 2) {
    		return -1;
    	}
    	int low = 0, high = A.length, mid;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(mid != low && mid != high) {
    			if(A[mid] > A[mid + 1] && A[mid] > A[mid -1]) {
    				return mid;
    			}
    			else if(A[mid + 1] > A[mid] && A[mid] > A[mid - 1]) {
    				low = mid;
    			} else {
    				high = mid;
    			}
    		} else {
    			break;
    		}
    	}
    	return -1;
    }
    
    public static void main(String[] args){
    	Solution temp = new Solution();
    	int[] nums = {1, 2, 1, 3, 4, 5, 7, 6};
    	System.out.println(temp.findPeak(nums));
    }
}

