class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
    	if(A == null || B == null) {
    		return;
    	}
    	int i = m - 1;
    	int j = n - 1;
    	int index = m + n - 1;
    	while(i != -1 && j != -1) {
    		if(A[i] > B[j]) {
    			A[index--] = A[i--];
    		} else {
    			A[index--] = B[j--];
    		}
    	}
    	while(i != -1) {
    		A[index--] = A[i--];
    	}
    	while(j != -1) {
    		A[index--] = B[j--];
    	}
    }
    
    public static void main(String[] args) {
    	int[] A = {1, 2, 3, 0, 0, 0, 0};
    	int[] B = {4, 5};
    	Solution temp = new Solution();
    	temp.mergeSortedArray(A, 3, B, 2);
    	System.out.println(A);
    }
}
