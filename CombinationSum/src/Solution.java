import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
    	if(candidates == null && target < 0) {
    		return null;
    	}
    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> input = new ArrayList<Integer>();
    	
    	for(int i = 0; i < candidates.length; ++i) {
    		input.add(candidates[i]);
    	}
    	
    	Collections.sort(input);
    	dfs(input, target, 0, list, result);
    	
    	return result;
    }
    
    public void dfs(List<Integer> candidates, int target, int position, List<Integer> list, List<List<Integer>> result) {
    	int s = sum(list);
    	if(s > target) {
    		return;
    	}
    	
    	if(s == target) {
    		result.add(new ArrayList<Integer>(list));
    		return;
    	}
    	
    	for(int i = position; i < candidates.size(); ++i) {
    		list.add(candidates.get(i));
    		dfs(candidates, target, position, list, result);
    		list.remove(list.size() - 1);
    		position++;
    	}
    	
    	return;
    }
    
    public int sum(List<Integer> list) {
    	if(list == null || list.size() == 0) {
    		return 0;
    	}
    	
    	int sum = 0;
    	
    	for(int i = 0; i < list.size(); ++i) {
    		sum += list.get(i);
    	}

    	return sum;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] a = {8,7,4,3};
    	System.out.println(temp.combinationSum(a, 11));
    }
}