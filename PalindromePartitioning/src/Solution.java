import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<String>> partition(String s) {
        // write your code here
    	if(s == null || s.length() == 0) {
    		return null;
    	}
    	
    	List<List<String>> result = new LinkedList<List<String>>();
    	List<String> list = new LinkedList<String>();
    	helper(s, 0, list, result);
    	
    	return result;
    	
    }
    
    public void helper(String s, int pos, List<String> list, List<List<String>> result) {
    	if(pos == s.length()) {
    		result.add(new LinkedList<String>(list));
    		return;
    	}
    	for(int i = pos + 1; i <= s.length(); ++i) {
    		String temp = s.substring(pos, i);
    		if(!isPalindrome(temp)) {
    			continue;
    		}
    		list.add(temp);
    		helper(s, i, list, result);
    		list.remove(list.size() - 1);
    	}
    }
    
    public boolean isPalindrome(String str) {
    	if(str == null) {
    		return false;
    	}
    	int start = 0, end = str.length() - 1;
    	while(start < end) {
    		if(str.charAt(start) != str.charAt(end)) {
    			return false;
    		}
    		start++;
    		end--;
    	}
    	
    	return true;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.partition("bb"));
    }
}
