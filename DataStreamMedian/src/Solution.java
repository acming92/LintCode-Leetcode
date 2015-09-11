import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: the median of numbers
     */
    public int[] medianII(int[] nums) {
        // write your code here
    	if(nums == null || nums.length == 0) {
    		return null;
    	}
    	
    	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(nums.length, 
    			new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2 - o1;
					}
    		
    	});
    	int[] result = new int[nums.length];
    	
    	for(int i = 0; i < nums.length; ++i) {
    		if(maxHeap.isEmpty()) {
    			maxHeap.add(nums[i]);
    		} else if(nums[i] < maxHeap.peek()){
    			maxHeap.add(nums[i]);
    		} else {
    			minHeap.add(nums[i]);
    		}
    		if(maxHeap.size() > minHeap.size() + 1) {
    			minHeap.add(maxHeap.poll());
    		} 
    		else if(maxHeap.size() < minHeap.size()) {
    			maxHeap.add(minHeap.poll());
    		}
    		result[i] = maxHeap.peek();
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] nums = {1, 2, 3, 4, 5};
    	int[] result = temp.medianII(nums);
    	for(int i = 0; i < result.length; ++i) {
    		System.out.println(result[i]);
    	}
    }
}