package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestElement {

	public static void main(String[] args) {
		
		//int points[][] = {{1,3},{-2,2}};
		int points[][] = {{3,3},{5,-1},{-2,4}};
		
		int [][] res = kClosest(points, 2);
		
		for(int[] r : res) {
				System.out.println(r[0] + " " +  r[1]);
		}
	}
	
	 public static int[][] kClosest(int[][] points, int K) {
	        if(points==null){
	            return null;
	        }
	        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
	           public int compare(int[] p1, int[] p2) {
	               return (p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]);
	           } 
	        });
	        
	        pq.offer(null);
	       
	        for(int i=0; i<points.length;i++) {
	            pq.add(points[i]);
	            if(pq.size()>K){
	            	System.out.println(pq.size()); 
	                pq.remove();
	            }
	        }
	        
	        int[][] result = new int[K][2];
	        int i=0;
	       
	        while(!pq.isEmpty()){
	            result[i] = pq.remove();
	            i++;
	        }
	        return result;
	    }

}
