
public class RemoveNList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n == 0) return head;
		if(head == null) return head;
		ListNode anchor = head;
        ListNode tar, iter = anchor;
        int i;
        n++;
        for(i = 0; i < n; ++i){
        	if(iter.next != null){
        		iter = iter.next;
        	} else {
        		if(i == n - 1){
        			return head.next;
        		}
        		return head;
        	}
        }
        
        tar = head;
        
        while(iter.next != null){
        	iter = iter.next;
        	tar = tar.next;
        }
        
        tar.next =tar.next.next;
		
		return head;
    }
	
	public static void main(String[] args){
		ListNode a = new ListNode(1);
		a.next = null;
		RemoveNList temp = new RemoveNList();
		System.out.println(temp.removeNthFromEnd(a, 1).val);
	}
}
