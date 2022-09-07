package test;

import test.TreeDFS_BFS_Invert_DistBetwTwoNodes.Node;

public class TreeInsertNewNode {
	Node root;
	
	static class Node{
		Node left;
		Node right;
		int val;
		
		public Node(int val, Node left, Node right) {
			super();
			this.val = val;
			this.left = left;
			this.right = right;
		}

		public Node(int val) {
			super();
			this.val = val;
		}
		
		
	}
	
	public static void main(String[] args) {
		TreeInsertNewNode r = new TreeInsertNewNode();
		r.root = new Node(7);
		
		r.root.left = new Node(2);
		r.root.right = new Node(10);
		
		r.root.left.left = new Node(1);
		r.root.left.right = new Node(3);
		
		
		r.root.right.left = new Node(8);
		r.root.right.right = new Node(40);
		
		printTree(r.root);
		addElement(r.root, 9);
		System.out.println("  ");
		printTree(r.root);
		
	
	}
	
	private static void addElement(Node root, int data){

		if(root == null){
			return;
		}
		
		if(root.val > data){
			if(root.left == null) {
				root.left = new Node(data);
			}else {
				addElement(root.left, data);
			}
			
		}else if(root.val < data){
			if(root.right == null) {
				root.right = new Node(data);
			}else {
				addElement(root.right, data);
			}
			}

}	
	
	private static void printTree(Node root) {
		if(root == null) {
			return;
		}
		
		printTree(root.left);
		System.out.print(root.val + "  ");
		printTree(root.right);
		
	}

}
