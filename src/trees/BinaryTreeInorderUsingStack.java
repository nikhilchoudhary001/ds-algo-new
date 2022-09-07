package trees;
import java.util.Stack; 

// Pre, post and inorder traversals using stack - https://www.enjoyalgorithms.com/blog/iterative-binary-tree-traversals-using-stack
// https://www.educative.io/edpresso/how-to-perform-an-iterative-inorder-traversal-of-a-binary-tree
// https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
}

public class BinaryTreeInorderUsingStack {

	 Node root;
    public static void inOrderTraversal(Node root)
    {
      Stack<Node> stack = new Stack();
      Node curr = root;
      while (!stack.empty() || curr != null)
      {
        if (curr != null)
        {
          stack.push(curr);
          curr = curr.left;
        }
        else
        {
          curr = stack.pop();
          System.out.print(curr.data + " ");
          curr = curr.right;
        }
      }
    }

    public static void main( String args[] )
    {
    	BinaryTreeInorderUsingStack tree = new BinaryTreeInorderUsingStack(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inOrderTraversal(tree.root); 
    }

}