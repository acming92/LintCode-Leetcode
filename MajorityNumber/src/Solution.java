import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
    	if(nums == null || nums.size() == 0) {
    		return -1;
    	}
    	int count = 0;
    	int candidate = -1;
    	
    	for(int i = 0; i < nums.size(); ++i) {
    		if(count == 0) {
    			candidate = nums.get(i);
    		}
    		
    		if(nums.get(i) == candidate) {
    			count++;
    		} else {
    			count--;
    		}
    	}
    	
    	return candidate;
    }
    
    public static void main(String[] args) {
    	
    }
}

