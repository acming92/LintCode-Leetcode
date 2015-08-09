public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if(nums == null) {
    		return 0;
    	} 
    	if(nums.length < 2) {
    		return nums.length;
    	}
    	int anchor = 1, index = 1;
    	while(index < nums.length) {
    		if(nums[index] != nums[index - 1]) {
    			nums[anchor++] = nums[index];
    		}
    		index++;
    	}
    	
    	return anchor;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {1,1,2, 2};
    	System.out.println(temp.removeDuplicates(A));
    }
}
