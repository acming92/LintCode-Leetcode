public class Solution {

	public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int val) {
	       this.val = val;
           this.next = null;
	   }
	}
	
	public int getListLength(ListNode head) {
		int size = 0;
		ListNode iter = head;
		
		while(iter != null) {
			size++;
			iter = iter.next;
		}
		
		return size;
	}
	 
    public void reorderList(ListNode head) {  
        // write your code here
    	if(head == null) {
    		return;
    	}
    	
    	int size = getListLength(head);
    	
    	if(size <= 2) {
    		return;
    	}
    	
    	ListNode font = new ListNode(0);
    	ListNode back = new ListNode(0);
    	ListNode fontIter = font, backIter = back;
    	ListNode dummyNode = new ListNode(0);
    	ListNode iter = dummyNode;
    	
    	for(int i = 0; i < size; ++i) {
    		if(i <= (size - 1) / 2) {
    			fontIter.next = head;
    			fontIter = fontIter.next;
        		head = head.next;
    		} else {
    			ListNode temp = head.next;
    			head.next = back.next;
    			back.next = head;
    			head = temp;
    		}
    	}
    	
    	fontIter = font.next;
    	backIter = back.next;
    	
    	while(fontIter != null && backIter != null) {
    		iter.next = fontIter;
    		iter = iter.next;
    		fontIter = fontIter.next;
    		iter.next = backIter;
    		iter = iter.next;
    		backIter = backIter.next;
    	}
    	
    	if(fontIter != null) {
    		iter.next = fontIter;
    		iter = iter.next;
    		iter.next = null;
    	}
    	
    	head =  dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}

