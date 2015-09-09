import java.util.ArrayList;

class Solution {
    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    public int totalNQueens(int n) {
        //write your code here
    	if(n <= 0) {
    		return 0;
    	}
    	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> state = new ArrayList<Integer>();
    	
    	getAllStates(0, n, state, list);
    	
    	return list.size();
    }
    
    public void getAllStates(int level, int n, ArrayList<Integer> state, 
    		ArrayList<ArrayList<Integer>> states) {
    	if(level == n) {
    		states.add(new ArrayList<Integer>(state));
    		return;
    	}
    	
    	for(int i = 0; i < n; ++i) {
    		state.add(i);
    		if(isValid(level, state)) {
    			getAllStates(level + 1, n, state, states);
    		}
    		state.remove(state.size() - 1);
    	}
    }
    
    public boolean isValid(int level, ArrayList<Integer> state) {
    	for(int i = 0; i < level; ++i) {
    		
    		if(state.get(i) == state.get(level)) {
    			return false;
    		}
    		
    		if(level - i  == abs(state.get(level) - state.get(i))) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public int abs(int value) {
    	return value > 0 ? value : -value;
    }
};