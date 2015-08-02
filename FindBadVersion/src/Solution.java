/**
 * public class VersionControl {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use VersionControl.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/

class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
    	if(n < 1) {
    		return -1;
    	}
    	int low = 1, high = n, mid;
    	while(low + 1 < high) {
    		mid = low + (high - low) / 2;
    		if(VersionControl.isBadVersion(mid)) {
    			high = mid;
    		} else {
    			low = mid;
    		}
    	}
    	if(VersionControl.isBadVersion(low)) {
    		return low;
    	}
    	
    	if(VersionControl.isBadVersion(high)) {
    		return high;
    	}
    	
    	return -1;
    }
}
