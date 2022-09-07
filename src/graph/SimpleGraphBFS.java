package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleGraphBFS {
	int v;
	LinkedList<Integer> l[] = null;
		
	SimpleGraphBFS(int v){
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
		SimpleGraphBFS g = new SimpleGraphBFS(4);
		
		    g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        System.out.println("Following is Breadth First Traversal "+
                    "(starting from vertex 2)");

	        g.BFS(2);

	}


	private void BFS(int i) {
		LinkedList<Integer> q = new LinkedList();
		
		boolean visited[] = new boolean[v];
		
		q.add(i);
		visited[i] = true;
		
		int curr,next;
		
		while(!q.isEmpty()) {
				curr = q.poll();
				System.out.println(curr);
				
				Iterator<Integer> itr = l[curr].listIterator();
				while(itr.hasNext()) {
					next = itr.next();
					if(!visited[next]) {
						visited[next] = true;
						q.add(next);
					}
				}
			
		}
	}

}
