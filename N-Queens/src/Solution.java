import java.util.ArrayList;
class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
    	if(n <= 0) {
    		return null;
    	}
    	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    	ArrayList<Integer> state = new ArrayList<Integer>();
    	
    	getAllStates(0, n, state, list);
    	print(n, list, result);
    	
    	return result;
    } 
    
    public void print(int n, ArrayList<ArrayList<Integer>> list, 
    		ArrayList<ArrayList<String>> result) {
    	for(int i = 0; i < list.size(); ++i) {
    		ArrayList<Integer> state = list.get(i);
    		ArrayList<String> map = new ArrayList<String>();
    		for(int j = 0; j < n; ++j) {
    			String line = "";
    			for(int k = 0; k < n; ++k) {
    				if(state.get(j) == k) {
    					line += 'Q';
    				} else {
    					line += '.';
    				}
    			}
    			map.add(line);
    		}
    		result.add(map);
    	}
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
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	System.out.println(temp.solveNQueens(4));
    }
};