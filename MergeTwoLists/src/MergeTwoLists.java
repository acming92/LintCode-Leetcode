
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null, start = null;
        ListNode iter1 = l1, iter2 = l2, iter3 = null;
        
        while(iter1 != null && iter2 != null){
        	if(iter1.val < iter2.val) {
        		iter3 = iter1;
        		iter1 = iter1.next;
        	} else {
        		iter3 = iter2;
        		iter2 = iter2.next;
        	}
        	if(l3 == null){
        		l3 = iter3;
        		start = l3;
        	} else {
        		l3.next = iter3;
        		l3 = l3.next;
        	}
        }
        
        while(iter1 != null){
        	if(l3 == null){
        		l3 = iter1;
        		start = l3;
        		iter1 = iter1.next;
        	} else {
        		l3.next = iter1;
        		iter1 = iter1.next;
        		l3 = l3.next;
        	}
        }
        
        while(iter2 != null){
        	if(l3 == null){
        		l3 = iter2;
        		start = l3;
        		iter2 = iter2.next;
        	} else {
        		l3.next = iter2;
        		iter2 = iter2.next;
        		l3 = l3.next;
        	}
        }
        
        return start;
    }
	
	public static void main(String[] args){
		
	}
}
