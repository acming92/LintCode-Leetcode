class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: a double whose format is *.5 or *.0
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
    	int length = A.length + B.length;
    	if(length == 0) return -1;
    	if(length % 2 == 0) {
    		return 1.0 * (findKthNumSortedArrays(A, 0, A.length - 1, B, 0, B.length - 1, length / 2)
    				+ findKthNumSortedArrays(A, 0, A.length - 1, B, 0, B.length - 1, length / 2 + 1)) / 2;
    	} else {
    		return findKthNumSortedArrays(A, 0, A.length - 1, B, 0, B.length - 1, length / 2 + 1);
    	}
    }
    
    public int findKthNumSortedArrays(int[] A, int startA, int endA, int[] B, int startB, int endB, int k) {
    	if(k == 1) {
    		if(startA >= A.length) return B[startB];
    		if(startB >= B.length) return A[startA];
    		return A[startA] < B[startB] ? A[startA]:B[startB];
    	}
    	int halfKA = 223423432;
    	int halfKB = 223423432;
    	if(endA - startA + 1 >= k / 2) {
    		halfKA = A[startA + k/2 - 1];
    	}
    	if(endB - startB + 1 >= k / 2) {
    		halfKB = B[startB + k/2 - 1];
    	}
    	
    	if(halfKA > halfKB) {
    		return findKthNumSortedArrays(A, startA, endA, B, startB + k / 2, endB, k - k / 2);
    	} else {
    		return findKthNumSortedArrays(A, startA + k / 2, endA, B, startB, endB, k - k / 2);
    	}
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {3};
    	int[] B = {4};
    	System.out.println(temp.findMedianSortedArrays(A, B));
    }
}

