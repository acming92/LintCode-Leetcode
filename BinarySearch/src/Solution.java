class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
    	if(nums == null) {
    		return -1;
    	}
    	int low = 0, high = nums.length - 1, mid;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(nums[mid] < target) {
    			low = mid;
    		} else {
    			high = mid;
    		}
    	}
    	
    	if(nums[low] == target) {
    		return low;
    	}
    	if(nums[high] == target) {
    		return high;
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] nums = {1, 2, 3, 3, 4, 5, 10};
    	System.out.println(temp.binarySearch(nums, 3));
    }
}
