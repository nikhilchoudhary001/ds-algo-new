package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleGraphDFSUsingStack {
	int v;
	LinkedList<Integer> l[] = null;
		
	SimpleGraphDFSUsingStack(int v){
			this.v = v;
			this.l = new LinkedList[v];
			for(int i = 0; i < v ; i++) {
				l[i] = new LinkedList();
			}
		}
	
	
	void addEdge(int v, int data){
		l[v].add(data);
	}

	public static void main(String[] args) {
		SimpleGraphDFSUsingStack g = new SimpleGraphDFSUsingStack(4);
		
		    g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 3);
	        g.addEdge(2, 0);
	        g.addEdge(3, 3);
	        
	        System.out.println("Following is Depth First Traversal "+
                    "(starting from vertex 2)");

	        g.DFS(2);

	}


	private void DFS(int i) {
		Stack<Integer> stack = new Stack<>();
		
		boolean visited[] = new boolean[v];
		
		stack.add(i);
		visited[i] = true;
		
		int curr,next;
		
		while(!stack.isEmpty()) {
				curr = stack.pop();
				System.out.print(curr + " ");
				
				Iterator<Integer> itr = l[curr].listIterator();
				while(itr.hasNext()) {
					next = itr.next();
					if(!visited[next]) {
						visited[next] = true;
						stack.add(next);
					}
				}
		}
	}

}
