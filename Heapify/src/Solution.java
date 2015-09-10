public class Solution {
    /**
     * @param A: Given an integer array
     * @return: void
     */
    public void heapify(int[] A) {
        // write your code here
    	if(A == null || A.length < 2) {
    		return;
    	}
    	
    	for(int i = A.length / 2; i >= 0; --i) {
    		shiftDown(A, i);
    	}
    }
    
    public void shiftDown(int[] A, int k) {
    		 while (k < A.length) {
    	            int smallest = k;
    	            if (k * 2 + 1 < A.length && A[k * 2 + 1] < A[smallest]) {
    	                smallest = k * 2 + 1;
    	            }
    	            if (k * 2 + 2 < A.length && A[k * 2 + 2] < A[smallest]) {
    	                smallest = k * 2 + 2;
    	            }
    	            if (smallest == k) {
    	                break;
    	            }
    	            int temp = A[smallest];
    	            A[smallest] = A[k];
    	            A[k] = temp;
    	            
    	            k = smallest;
    	        }
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] a = {3,2,1,4,5};
    	temp.heapify(a);
    	for(int i = 0; i < a.length; ++i) {
    		System.out.println(a[i]);
    	}
    }
}