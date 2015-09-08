import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for undirected graph.

 */
public class Solution {
	static class UndirectedGraphNode {
	   int label;
	   ArrayList<UndirectedGraphNode> neighbors;
	   UndirectedGraphNode(int x) { 
		   label = x; 
		   neighbors = new ArrayList<UndirectedGraphNode>();
	   }
	};
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
    	if(node == null) {
    		return node;
    	}
    	UndirectedGraphNode head = null;
    	Queue<UndirectedGraphNode> list = new LinkedList<UndirectedGraphNode>();
    	HashMap<UndirectedGraphNode, UndirectedGraphNode> map = 
    			new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
    	list.add(node);
    	while(!list.isEmpty()) {
    		UndirectedGraphNode listNode = list.poll();
    		UndirectedGraphNode copyNode;
    		
    		if(!map.containsKey(listNode)) {
        		copyNode = new UndirectedGraphNode(listNode.label);
        		map.put(listNode, copyNode);
        		if(listNode == node) {
        			head = copyNode;
        		}
    		} else {
        		copyNode = map.get(listNode);
    		}
    		
    		if(listNode.neighbors != null && copyNode.neighbors.size() == 0) {
    			for(int i = 0; i < listNode.neighbors.size(); ++i) {
    				UndirectedGraphNode getNode;
    				if(!map.containsKey(listNode.neighbors.get(i))) {
    					getNode = new UndirectedGraphNode(listNode.neighbors.get(i).label);
    					map.put(listNode.neighbors.get(i), getNode);
    				} else {
    					getNode = map.get(listNode.neighbors.get(i));
    				}
    				
    				copyNode.neighbors.add(getNode);
    				list.add(listNode.neighbors.get(i));
     			}
    		}
    	}
    	
    	return head;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	UndirectedGraphNode head = new UndirectedGraphNode(-1);
    	head.neighbors.add(head);
    	head.neighbors.add(head);
    	temp.cloneGraph(head);
    }
}
