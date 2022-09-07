package linkedlist;

public class ReverseLinkedList {
	
	static Node head;
	static Node revHead;
	
	static class Node{
		Node ptr;
		int val;
		
		Node(int data){
			this.val = data;
			this.ptr = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.ptr = new Node(2);
		node.ptr.ptr = new Node(3);
		node.ptr.ptr.ptr = new Node(4);
		node.ptr.ptr.ptr.ptr = new Node(5);
		
		
		head = node;
		
//		Node res1 = reverseIterative(head);
//		
//		print(res1);
		
		reverseRecursive(head);
		
		print(revHead);
		
//		Node res3 = swapAdjacent(res1);
//
//		print(res3);
	}
	
	 public static Node reverseRecursive(Node head){
         // Recursive approach
        if(head == null || head.ptr == null){
            return revHead = head;
        } 
        Node  temp = reverseRecursive(head.ptr);
        head.ptr = null;
        temp.ptr = head;
        return temp.ptr;
    }
	 
	private static void print(Node res) {
		Node next = res;
		while(next != null) {
			System.out.print(next.val + " -> ");
			next = next.ptr;
		}
		System.out.println();
	}

	private static Node reverseIterative(Node head) {
		
		if(head == null) {
			return null;
		}
		
		Node temp = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null) {
			
			next = curr.ptr;
			curr.ptr = temp;
			temp = curr;
			
			curr = next;	
		}
		
		return temp;
	} 

	private static Node swapAdjacent(Node head) {
		Node temp = null;
		Node prev = null;
		Node curr = null;
		Node next = null;
		
		if(head.ptr != null) {
			next = head.ptr.ptr;
			head.ptr.ptr = null;
			
			temp = head.ptr;
			temp.ptr = head;
			head.ptr = null;
			
		}
		
		while(next != null) {
			prev = next;
			curr = next.ptr;
			
			if(curr != null) {
				next = curr.ptr;
			}
			
			prev.ptr = null;
			curr.ptr = prev;
			
		}
		
		temp.ptr = prev;
		
		return temp;
	}

}
