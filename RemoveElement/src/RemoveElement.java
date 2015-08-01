
public class RemoveElement {
	
    public int removeElement(int[] nums, int val) {
        int start = 0, end = nums.length - 1;
        
        if(nums == null) return 0;
        if(nums.length == 0) return 0;
        
        while(start != end) {
        	if(nums[start] == val){
        		nums[start] = nums[end];
        		nums[end] = val;
        		end--;
        	} else {
        		start++;
        	}
        }
        
        if(nums[start] == val) {
        	start--;
        }
        
        return start + 1;
    }
    
	public static void main(String[] args){
		
	}
}
