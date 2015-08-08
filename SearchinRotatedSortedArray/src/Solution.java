public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
    	if(A == null || A.length == 0) {
    		return -1;
    	}
    	
    	int low = 0, high = A.length - 1, mid;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(A[mid] == target) {
    			return mid;
    		}
    		if(A[mid] > A[low]) {
    			if(A[low] <= target && target <= A[mid]) {
    				high = mid;
    			} else {
    				low = mid;
    			}
    		} else {
    			if(A[mid] <= target && target <= A[high]) {
    				low = mid;
    			} else {
    				high = mid;
    			}
    		}
    	}
    	
    	if(A[low] == target) {
    		return low;
    	}
    	
    	if(A[high] == target) {
    		return high;
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] nums = {6,8,9,1,3,5};
    	System.out.println(temp.search(nums, 5));
    }
}

