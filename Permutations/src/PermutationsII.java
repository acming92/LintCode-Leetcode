import java.util.ArrayList;
import java.util.Collections;

public class PermutationsII {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
    	ArrayList<ArrayList<Integer>> permuList = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> empty = new ArrayList<Integer>();
    	if(nums == null || nums.size() == 0) {
    		return permuList;
    	}
    	
    	int[] visited = new int[nums.size()];
    	Collections.sort(nums);
    	FindPermuteSet(empty, visited, nums, permuList);
    	
    	return permuList;
    }
    
    public void FindPermuteSet(ArrayList<Integer> findSet, int[] visited, ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> permuList) {
    	if(findSet.size() == nums.size()) {
    		permuList.add(new ArrayList<Integer>(findSet));
    		return;
    	}
    	for(int i = 0; i < nums.size(); ++i) { 
    		if(visited[i] == 1 || (i != 0 && nums.get(i) == nums.get(i - 1) && visited[i - 1] == 1)) {
    			continue;
    		}
    		visited[i] = 1;
    		findSet.add(nums.get(i));
    		FindPermuteSet(findSet, visited, nums, permuList);
    		findSet.remove(findSet.size() - 1);
    		visited[i] = 0;
    	}
    }
    
    public static void main(String[] args){
		
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	nums.add(1);
    	nums.add(2);
    	nums.add(2);
		PermutationsII temp = new PermutationsII();
		ArrayList<ArrayList<Integer>> ans = temp.permuteUnique(nums);
		System.out.println(ans);
	}
}
