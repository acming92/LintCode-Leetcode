class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
    	if(nums == null || nums.length == 0) {
    		return;
    	}
    	
    	int red = 0, blue = nums.length - 1;
    	for(int i = 0; i < nums.length && i < blue + 1;) {
    		if(nums[i] == 0) {
    			swamp(red, i, nums);
    			red++;
    		}
    		if(nums[i] == 2) {
    			swamp(blue, i, nums);
    			blue--;
    		} else {
    			i++;
    		}
    	}
    }
    
    public void swamp(int i, int j, int[] nums) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] input = {2,0,2,2,1,2,2,1,2,0,0,0,1};
    	temp.sortColors(input);
    	
    	for(int i = 0; i < input.length; ++i) {
    		System.out.print(input[i]);
    	}
    }
    
}
