public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
    	if(A == null) return 0;
    	if(A.length == 0) return 0;
    	int low = 0, high = A.length - 1, mid;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(A[mid] < target) {
    			low = mid;
    		} else {
    			high = mid;
    		}
    	}
    	
    	if(A[low] == target) {
    		return low;
    	}
    	
    	if(A[high] == target) {
    		return high;
    	}
    	
    	if(A[high] < target) {
    		return high + 1;
    	}
    	
    	if(A[low] > target) {
    		return low;
    	}
    	
    	return high;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {1, 3, 5, 6};
    	int target = 7;
    	System.out.println(temp.searchInsert(A, target));
    }
}

