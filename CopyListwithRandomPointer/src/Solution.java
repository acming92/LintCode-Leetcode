/**
 * Definition for singly-linked list with a random pointer.

 */
public class Solution {

	static class RandomListNode {
		  int label;
		  RandomListNode next, random;
		  RandomListNode(int x) {
			  this.label = x; 
		  }
	};
	
	public RandomListNode copy(RandomListNode head) {
		RandomListNode dummyNode = new RandomListNode(0);
		dummyNode.next = head;
		while(head != null) {
			RandomListNode node = new RandomListNode(head.label);
			node.next = head.next;
			head.next = node;
			head = node.next;
		}
		
		return dummyNode;
	}
	
	public RandomListNode spilt(RandomListNode head) {
		RandomListNode dummyNode = head;
		head = head.next;
		dummyNode.next = head.next;

		while(head.next.next != null) {
			RandomListNode newNode = head.next;
			RandomListNode nextNode = head.next.next;
			newNode.next = nextNode.next;
			if(head.random != null) {
				newNode.random = head.random.next;
			}
			head = nextNode;
		}
		if(head.random != null) {
			head.next.random = head.random.next;
		}
		return dummyNode.next;
	}
		 
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
    	if(head == null) {
    		return head;
    	}
    	if(head.next == null) {
    		RandomListNode node = new RandomListNode(0);
    		node.label = head.label;
    		node.random = head.random;
    		return node;
    	}
    	RandomListNode node = copy(head);
    	node = spilt(node);
    	return node;
    }
    
    
    
    public static void main(String[] args) {
    	int[] input = {-1, 1};
    	RandomListNode dummyNode = new RandomListNode(0);
    	RandomListNode head = dummyNode;
    	for(int i = 0; i < input.length; ++i) {
    		RandomListNode node = new RandomListNode(input[i]);
    		head.next = node;
    		head = node;
    	}
    	Solution temp = new Solution();
    	RandomListNode iter = temp.copyRandomList(dummyNode.next);
    	while(iter != null) {
    		System.out.println(iter.label);
    		iter = iter.next;
    	}
    }
}