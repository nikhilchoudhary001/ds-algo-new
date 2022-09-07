package linkedlist;

import linkedlist.ReverseLinkedList.Node;

// https://www.youtube.com/watch?v=0QPpgAsd4IY
// Logic in which I'm changing the structure of the given input lists i.e not creating any new result list. This is difficult soln
// If we don't want to change the structure of list it would become easy
public class MergeTwoSortedLists {
	static class Node {
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static Node mergeList(Node list1, Node list2) {
		 Node head = null;
		 Node curr = null;
		 
		if(list1.data < list2.data) {
			head = list1;
			curr = list1;
			list1 = list1.next;
		} else {
			head = list2;
			curr = list2;
			list2 = list2.next;
		}
		
	    while(list1 != null && list2 != null){
	    	if(list1.data < list2.data) {
				curr.next = list1;
				curr = list1;
				list1 = list1.next;
			}else {
				curr.next = list2;
				curr = list2;
				list2 = list2.next;
			}
	    }
	    
	    while(list1 != null) {
	    	curr.next = list1;
	    	list1 = null;
	    }
	    while(list2 != null) {
	    	curr.next = list2;
	    	list2 = null;
	    }
	    
	    return head;
	}
	
	public static void main(String[] args) {
		/*
		Merge two sorted linked lists
		Ex:
		List1: 1->4->5->7->9->null
		List2: 2->3->6->8->null
		Output: 1->2->3->4->5->6->7->8-9->null
		
		List1: 1->14->35->47->49->null
		List2: 20->23->36->88->null
		*/

		Node node = new Node(1);
		node.next = new Node(14);
		node.next.next = new Node(35);
		node.next.next.next = new Node(47);
		node.next.next.next.next = new Node(49);
		
		Node node2 = new Node(20);
		node2.next = new Node(23);
		node2.next.next = new Node(36);
		node2.next.next.next = new Node(88);
		//node2.next.next.next.next = new Node(5);
		
		Node result = mergeList(node, node2);
		
		while(result != null) {
			System.out.print(result.data + " -> ");
			result = result.next;
		}

	}

}
