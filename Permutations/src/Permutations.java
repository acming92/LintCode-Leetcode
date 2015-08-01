import java.util.ArrayList;

public class Permutations {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
    	ArrayList<ArrayList<Integer>> permuList = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> empty = new ArrayList<Integer>();
    	if(nums == null || nums.size() == 0) {
    		return permuList;
    	}
 
    	FindPermuteSet(empty, nums, permuList);
    	
    	return permuList;
    }
    
    public void FindPermuteSet(ArrayList<Integer> findSet, ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> permuList) {
    	if(findSet.size() == nums.size()) {
    		permuList.add(new ArrayList<Integer>(findSet));
    		return;
    	}
    	for(int i = 0; i < nums.size(); ++i) { 
    		if(findSet.contains(nums.get(i))) {
    			continue;
    		}
    		findSet.add(nums.get(i));
    		FindPermuteSet(findSet, nums, permuList);
    		findSet.remove(findSet.size() - 1);
    	}
    }
}
