import java.util.List;

public class Solution {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	       this.val = val;
	       this.next = null;
	    }
	}
	 
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
    	if(lists == null) {
    		return null;
    	}
    	
    	if(lists.size() == 0) {
    		return null;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	ListNode iter = dummyNode;
    	while(true) {
        	int min = 0xffffff;
        	int minIndex = 0;
        	for(int i = 0; i < lists.size(); ++i) {
        		ListNode node = lists.get(i);
        		if(node != null) {
        			if(node.val < min) {
        				min = node.val;
        				minIndex = i;
        			}
        		}
        	}
        	if(min != 0xffffff) {
        		ListNode node = new ListNode(min);
        		iter.next = node;
        		iter = iter.next;
        		node = lists.get(minIndex);
        		node = node.next;
        		lists.set(minIndex, node);
        	} else {
        		break;
        	}
    	}
    	
    	return dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}

