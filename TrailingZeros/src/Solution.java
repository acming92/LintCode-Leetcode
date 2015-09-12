class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
    	if(n < 0) {
    		return 0;
    	}
    	
    	if(n == 1) {
    		return 1;
    	}
    	
    	int par = 5;
    	int result = 0;
    	while(n > par) {
    		result += n / par;
    		par *= 5;
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.trailingZeros(11));
    }
};

