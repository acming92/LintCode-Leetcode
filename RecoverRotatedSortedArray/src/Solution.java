import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
    	if(nums == null || nums.size() == 1) {
    		return;
    	}
    	for(int i = 0; i < nums.size() - 1; ++i) {
    		if(nums.get(i) > nums.get(i + 1)) {
    			reverse(0, i, nums);
    			reverse(i + 1, nums.size() - 1, nums);
    			reverse(0, nums.size() - 1, nums);
    			return;
    		}
    	}
    }
    
    private void swap(int i, int j, ArrayList<Integer> nums) {
    	if(i >= nums.size() || j >= nums.size()) {
    		return;
    	}
    	int swap = nums.get(i);
    	nums.set(i, nums.get(j));
    	nums.set(j, swap);
    }
    
    private void reverse(int i, int j, ArrayList<Integer> nums) {
    	if(i >= nums.size() || j >= nums.size()) {
    		return;
    	}
    	while(i < j) {
    		swap(i++, j--, nums);
    	}
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	nums.add(4);
    	nums.add(5);
    	nums.add(1);
    	nums.add(2);
    	nums.add(3);
    	temp.recoverRotatedSortedArray(nums);
    	System.out.println(nums);
    }
}
