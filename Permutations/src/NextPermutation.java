import java.util.ArrayList;

public class NextPermutation {
	 /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public int[] nextPermutation(int[] nums) {
        // write your code here
    	if(nums == null) {
    		return null;
    	}
    	
    	if(nums.length == 0 || nums.length == 1) {
    		return nums;
    	}
    	int i;
    	for(i = nums.length - 2; i >= 0; i--) {
    		if(nums[i + 1] > nums[i]) {
    			break;
    		}
    	}
    	if(i == -1) {
    		reverse(nums, 0, nums.length - 1);
    		return nums;
    	}
    	
    	for(int j  = nums.length - 1; j > i; j--) {
    		if(nums[j] > nums[i]) {
    			swap(nums, i, j);
    			reverse(nums, i + 1, nums.length - 1);
    			break;
    		}
     	}
    	return nums;
    }
    
    private void swap(int[] nums, int i, int j) {
    	int swap = nums[i];
    	nums[i] = nums[j];
    	nums[j] = swap;
    }
    
    private void reverse(int[] nums, int i, int j) {
    	for(;i < j; i++, j--) {
    		swap(nums, i, j);
    	}
    }
    
   public static void main(String[] args){
	   NextPermutation temp = new NextPermutation();
	   int[] nums = {1, 3, 2};
	   nums = temp.nextPermutation(nums);
	   for(int i = 0; i < nums.length; ++i) {
		   System.out.println(" " + nums[i]);
	   }
   }
}
