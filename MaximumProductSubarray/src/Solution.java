public class Solution {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public int maxProduct(int[] nums) {
        // write your code here
    	if(nums == null || nums.length == 0) {
    		return 0;
    	}
    	
    	int[] min = new int[nums.length + 1];
    	int[] max = new int[nums.length + 1];
    	
    	min[0] = 1;
    	max[0] = 1;
    	
    	int result = -0xffffff;
    	
    	for(int i = 1; i <= nums.length; ++i) {
    		if(nums[i - 1] > 0) {
    			max[i] = Math.max(max[i - 1] * nums[i - 1], nums[i - 1]);
    			min[i] = Math.min(min[i - 1] * nums[i - 1], nums[i - 1]);
    		} else {
    			max[i] = Math.max(min[i - 1] * nums[i - 1], nums[i - 1]);
    			min[i] = Math.min(max[i - 1] * nums[i - 1], nums[i - 1]);
    		}
    		
    		result = Math.max(max[i], result);
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] nums = {2,3,-2,4};
    	System.out.println(temp.maxProduct(nums));
    }
}