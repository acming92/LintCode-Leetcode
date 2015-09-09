import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	class DirectedGraphNode {
	    int label;
	    ArrayList<DirectedGraphNode> neighbors;
		DirectedGraphNode(int x) 
		{ 
			label = x; 
			neighbors = new ArrayList<DirectedGraphNode>(); 
		}
	};
		 
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
    	if(graph == null || graph.size() < 2) {
    		return graph;
    	}
    	
    	ArrayList<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();
    	HashMap<DirectedGraphNode, Integer> map = new HashMap<DirectedGraphNode, Integer>();
    	for(DirectedGraphNode node : graph) {
    		for(DirectedGraphNode neighboor : node.neighbors) {
    			if(!map.containsKey(neighboor)) {
    				map.put(neighboor, 1);
    			} else {
    				map.put(neighboor, map.get(neighboor) + 1);
    			}
    		}
    	}
    	
    	Queue<DirectedGraphNode> queue = new LinkedList<DirectedGraphNode>();
    	
    	for(DirectedGraphNode node : graph) {
    		if(!map.containsKey(node)) {
    			queue.add(node);
    		}
    	}
    	
    	while(!queue.isEmpty()) {
    		DirectedGraphNode node = queue.poll();
    		result.add(node);
    		for(DirectedGraphNode neighbor : node.neighbors) {
    			map.put(neighbor, map.get(neighbor) - 1);
    			if(map.get(neighbor) == 0) {
    				queue.add(neighbor);
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    }
}