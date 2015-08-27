public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
    	if(num == null || num.length == 0) {
    		return -1;
    	}
    	if(num.length == 1) {
    		return num[0];
    	}
        // write your code here
    	int low = 0, high = num.length - 1, mid;
    	int last = num.length - 1;
    	if(num[0] < num[1] && num[0] < num[last]) {
    		return num[0];
    	}
    	if(num[last] < num[0] && num[last] < num[last - 1]) {
    		return num[last];
    	}
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(mid == 0) {
    			return num[mid];
    		}
    		if(num[mid] < num[mid + 1] && num[mid] < num[mid - 1]) {
    			return num[mid];
    		} else {
    			if(num[mid] > num[0]) {
    				low = mid;
    			} else {
    				high = mid;
    			}
    		}
    	}
    	return num[low] < num[high]? num[low]:num[high];
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {0, 1, 2, 3};
    	System.out.println(temp.findMin(A));
    }
}
