import java.util.ArrayList;
import java.util.Collections;

class Solution {
	  /**
	     * @param S: A set of numbers.
	     * @return: A list of lists. All valid subsets.
	     */
	    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
	        // write your code here
	    	if(S == null) {
	    		return null;
	    	}
	    	ArrayList<ArrayList<Integer>> subsetList = new ArrayList<ArrayList<Integer>>();
	    	ArrayList<Integer> empty = new ArrayList<Integer>();
	    	if(S.size() == 0) {
	    		subsetList.add(empty);
	    	} else {
	    	    Collections.sort(S);
	    	    FindSubSet(0, empty, S, subsetList);
	    	}
	    	
	    	return subsetList;
	    	
	    }
	    
	    public void FindSubSet(int start, ArrayList<Integer> findSet,
	    		ArrayList<Integer> S, ArrayList<ArrayList<Integer>> subsetList){
	    	subsetList.add(new ArrayList<Integer>(findSet));
	    	for(int i = start; i < S.size(); ++i) {
	    		if(i != start && S.get(i) == S.get(i - 1)) {
	    			continue;
	    		}
	    		findSet.add(S.get(i));
	    		FindSubSet(i + 1, findSet, S, subsetList);
	    		findSet.remove(findSet.size() - 1);
	    	}
	    }
	}
