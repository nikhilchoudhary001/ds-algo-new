package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeDFS_BFS_Invert_DistBetwTwoNodes {
	Node root;
	static int leftDist = 0;
	static int rightDist = 0;
	
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
		
		
		TreeDFS_BFS_Invert_DistBetwTwoNodes r = new TreeDFS_BFS_Invert_DistBetwTwoNodes();
		r.root = new Node(5);
		
		r.root.left = new Node(7);
		r.root.right = new Node(8);
		
		r.root.left.left = new Node(1);
		r.root.left.right = new Node(3);
		
		r.root.left.left.left = new Node(100);
		
		r.root.left.left.right = new Node(9);
		r.root.left.left.right.left = new Node(19);
		
		r.root.left.right.left = new Node(25);
		r.root.left.left.left.right = new Node(250);
		
		r.root.right.left = new Node(13);
		r.root.right.right = new Node(40);
		
//		Stack<Node> s = new Stack<>();
//		s.push(r.root);
//		
//		Queue<Node> q = new LinkedList<>();
//		q.add(r.root);
		
//		printTree(r.root);
//		invert(r.root);
//		System.out.println("  ");
//		printTree(r.root);
		
//		dfsUsingStack(r.root, s);
//		bfsUsingQueue(q);
		
		findCommonAncestor(r.root, r.root.left.left.left.right, r.root.left.left.right.left);

	}

	private static boolean findCommonAncestor(Node root, Node right, Node left) {
		
		if(root == null) {
			return false;
		}
		boolean first = false;
		boolean second = false;
		
		if(root.val == right.val) {
			first = true;
			rightDist++;
			return first;
		}
		
		if(root.val == left.val) {
			second = true;
			leftDist++;
			return second;
		}
		
		second = findCommonAncestor(root.left, right, left);
		first = findCommonAncestor(root.right, right, left);
		
		if(second && first) {
			int res = leftDist+rightDist+1;
			System.out.println("Common node is "+ root.val);
			System.out.println("Total distance betn two nodes is "+ res);
		}
		
		if(second) {
			leftDist++;
			return true;
		}
		if(first) {
			rightDist++;
			return true;
		}
		
		return false;
		
	}

	private static void bfsUsingQueue(Queue<Node> q) {
		if(q.size() != 0) {
			Node n = q.poll();
			System.out.println(n.val);
			
			if(n.left != null) {
				q.add(n.left);
			}
			if(n.right != null) {
				q.add(n.right);
			}
			
			bfsUsingQueue(q);
		}else {
			return;
		}
		
		
		
	}

	private static void dfsUsingStack(Node root, Stack<Node> s) {
		
		if(s.size() == 0) {
			return;
		}else {
			if(root != null) {
				Node curr = s.pop();
				System.out.println(curr.val);
				
				if(curr.right != null)
				s.push(curr.right);
				
				if(curr.left != null)
				s.push(curr.left);
				
				if(s.size() != 0)
				dfsUsingStack(s.peek(), s);
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

	private static void invert(Node root) {
		if(root == null) {
			return;
		}
		
		invert(root.left);
		
		Node temp = root.right;
		
		root.right = root.left;
		root.left = temp;
		
		invert(root.left);
		
	}

}
