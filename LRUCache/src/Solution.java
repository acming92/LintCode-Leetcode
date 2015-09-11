import java.util.HashMap;

public class Solution {
	
	private class Node {
	    int key;
	    int value;
	    Node pre;
	    Node next;
	 
	    public Node(int key, int value){
	        this.key = key;
	        this.value = value;
	    }
	}
	
	private int capacity;
    private int count = 0;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private Node dummyNode = null;
	private Node tail = null;

    // @param capacity, an integer
    public Solution(int capacity) {
        // write your code here
    	this.capacity = capacity;
    	dummyNode = new Node(0, 0);
    }

    // @return an integer
    public int get(int key) {
        // write your code here
    	if(map.containsKey(key)) {
    		Node node = map.get(key);
    		remove(node);
    		addHead(node);
    		return node.value;
    	}
    	
    	return -1;
    }
    
    public void remove(Node node) {
    	if(node.next != null) {
    		node.pre.next = node.next;
        	node.next.pre = node.pre;
    	} else {
    		node.pre.next = null;
    		tail = node.pre;
    	} 	
    }
    
    public void addHead(Node node) {
    	node.next = dummyNode.next;
    	dummyNode.next = node;
    	if(node.next != null) {
    		node.next.pre = node;
    	} else {
    		tail = node;
    	}
    	node.pre = dummyNode;
    }
    
    public void removeEnd() {
    	map.remove(tail.key);
    	tail.pre.next = null;
    	tail = tail.pre;
    }

    // @param key, an integer
    // @param value, an integer
    // @return nothing
    public void set(int key, int value) {
        // write your code here
    	if(map.containsKey(key)) {
    		Node node = map.get(key);
    		node.value = value;
    		remove(node);
    		addHead(node);
    	} else {
    		Node node = new Node(key, value);
        	map.put(key, node);
        	if(dummyNode.next == null) {
        		tail = node;
        	}
        	addHead(node);
    		count++;
    		if(count > capacity) {
    			removeEnd();
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution(2);
    	temp.set(2, 1);
    	temp.set(1, 1);
    	System.out.println(temp.get(2));
    	temp.set(4, 1);
    	System.out.println(temp.get(1));
    	System.out.println(temp.get(2));
    }
}
