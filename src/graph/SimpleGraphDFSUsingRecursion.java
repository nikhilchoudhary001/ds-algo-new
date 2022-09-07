package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleGraphDFSUsingRecursion {
	int v;
	LinkedList<Integer> l[] = null;
		
	SimpleGraphDFSUsingRecursion(int v){
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
		SimpleGraphDFSUsingRecursion g = new SimpleGraphDFSUsingRecursion(5);
		
		    g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 4);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        System.out.println("Following is Depth First Traversal using Recursion "+
                    "(starting from vertex 2)");

	        g.DFS();
	}

	private void DFS() {   
		boolean visited[] = new boolean[v];
	
		for (int i = 0; i < v; ++i)   // For handling disconnected graph
            if (visited[i] == false)
            	DFSUtil(visited, i);
	}

	private void DFSUtil(boolean[] visited, int i) {
		int next;
		if(!visited[i]) {
			System.out.println(i + " ");
			visited[i] = true;
			Iterator<Integer> itr = l[i].listIterator();
			while(itr.hasNext()) {
				next = itr.next();
				DFSUtil(visited, next);
			}
		}
		
	}

}
