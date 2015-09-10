
public class Solution {

	public static class ListNode {
	   int val;
	   ListNode next;
       ListNode(int x) {
    	   val = x;
	       next = null;
	   }
	}
	 
    public ListNode[] rehashing(ListNode[] hashTable) {
        // write your code here
    	if(hashTable == null || hashTable.length == 0) {
    		return null;
    	}
    	
    	int size = 2 * hashTable.length;
    	ListNode[] result = new ListNode[size];
    	ListNode dummyNode = new ListNode(0);
    	
    	for(int i = 0; i < hashTable.length; ++i) {
    		ListNode iter = hashTable[i];
    		while(iter != null) {
    			int index = (iter.val % size + size) % size;
    			dummyNode.next = result[index];
    			ListNode shift = dummyNode;
    			while(shift.next != null) {
    				shift = shift.next; 
    			}
    			ListNode node = new ListNode(iter.val);
    			shift.next = node;
    			result[index] = dummyNode.next;
    			iter = iter.next;
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	ListNode node = new ListNode(42);
    	ListNode node1 = new ListNode(32);
    	ListNode node2 = new ListNode(-7);
    	node.next = node1;
    	ListNode[] hashTable = new ListNode[5];
    	hashTable[3] = node;
    	hashTable[3] = node2;
    	System.out.println(temp.rehashing(hashTable));
    }
};