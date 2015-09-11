class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
    	long low = 0;
    	long high = x;
    	
    	while(high >= low) {
    		long mid = low + (high - low) / 2;
    		if(x == mid * mid) {
    			return (int)mid;
    		}
    		if(x < mid * mid) {
    			high = mid - 1;
    		} else {
    			low = mid + 1;
    		}
    	}
    	
    	return (int)high;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.sqrt(10));
    }
}
