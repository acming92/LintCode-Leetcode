import java.util.ArrayList;

public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(A == null || A.size() == 0) {
    		result.add(-1);
    		result.add(-1);
    		return result;
    	}
    	int low, high, mid;
    	int start = -1, end = -1;
    	low = 0;
    	high = A.size() - 1;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(A.get(mid) < target) {
    			low = mid;
    		} else {
    			high = mid;
    		}
    	}
    	if(A.get(low) == target) {
    		start = low;
    	}
    	else if(A.get(high) == target) {
    		start = high;
    	}
    	low = 0;
    	high = A.size() - 1;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(A.get(mid) <= target) {
    			low = mid;
    		} else {
    			high = mid;
    		}
    	}
    	if(A.get(high) == target) {
    		end = high;
    	}
    	else if(A.get(low) == target) {
    		end = low;
    	}
    	result.add(start);
    	result.add(end);
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(5);A.add(7);A.add(7);A.add(8);A.add(8);A.add(10);
    	System.out.println(temp.searchRange(A, 8));
    }
}

