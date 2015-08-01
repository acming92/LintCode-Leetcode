
public class RemoveDuplicates {
	
    public int removeDuplicates(int[] nums) {
       int i = 0, j = 0; 
       int count = 1;
       
       if(nums == null) return 0;
       if(nums.length <= 1) return nums.length;
       
       for(;i < nums.length;){
    	   if(i == j) {
    		   i++;
    	   } else {
    		   if(nums[i] != nums[j]){
    			   nums[count] = nums[i];
    			   count++;
    			   i++;
    			   j = i;
    		   } else {
    			   i++;
    		   }
    	   }
       }

       return count;
    }
	
	public static void main(String[] args){
		
		int[] nums = {1, 1, 2};
		RemoveDuplicates temp = new RemoveDuplicates();
		System.out.println(temp.removeDuplicates(nums));
	}
}
