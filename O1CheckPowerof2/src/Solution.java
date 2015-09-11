class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
    	boolean res = ((n & (n - 1)) == 0) ? true : false;
    	
    	return res;
    }
    
    public static void main(String[] args) {
    	
    }
};