import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Solution {
    /**
      * @param start, a string
      * @param end, a string
      * @param dict, a set of string
      * @return an integer
      */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
    	if(start == null || end == null || dict == null) {
    		return 0;
    	}
    	
    	int count = 0;
    	Queue<String> queue = new LinkedList<String>();
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	queue.add(start);
    	map.put(start, 0);
    	
    	while(!queue.isEmpty()) {
    		String state = queue.poll();
    		if(state.equals(end)) {
    			return map.get(state);
    		}
    		Stack<String> stack = new Stack<String>();
    		for(String iter : dict) {
    			if(isUnit(iter, state)) {
    				queue.add(iter);
    				map.put(iter, map.get(state) + 1);
    				stack.push(iter);
    			}
    		}
    		while(!stack.isEmpty()) {
    			dict.remove(stack.pop());
    		}
    	}
    	
    	return count;
    }
    
    public boolean isUnit(String a, String b) {
    	if(a == null || b == null) {
    		return false;
    	}
    	
    	if(a == b) {
    		return false;
    	}
    	
    	int count = 0;
    	for(int i = 0; i < a.length(); ++i) {
    		if(a.charAt(i) != b.charAt(i)) {
    			count++;
    		}
    		if(count > 1) {
    			return false;
    		}
    	}
    
    	return true;
    }
    
    public static void main(String[] args) {
    	
    }
}
