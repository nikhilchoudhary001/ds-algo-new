package test;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class OLAGraphMazeProblemBFS{
	static class QItem{
		private int row;
		private int col;
		private int dis;
		
		public QItem(int row, int col, int dis) {
			super();
			this.row = row;
			this.col = col;
			this.dis = dis;
		}
		
		
	}
    public static int numSteps(int N, int A, int B, char[][] grid) {
     
    	QItem source = new QItem(0,0,0);
        int dist1 = dist(0,0,N,A,B,grid,source);
        source.row = A;
        source.col = B;
        int dist2 = dist(A,B,N,N,N,grid,source);
        
        System.out.println("Total distance is "+ (dist1 + dist2));
        
        return dist1 + dist2;
    }
    
    public static int dist(int row, int col, int N, int A, int B, char[][] grid, QItem source){
    		
    	int[][] visited = new int[N+1][N+1];
    	Queue<QItem> queue = new LinkedList<>();
    	
    	for(int i = 0; i <= N ; i++) {
    		for(int j = 0; j <= N ; j++) {
        		if(grid[i][j] == '#') {
        			visited[i][j] = 1;
        		}
//        		if(grid[i][j] == 'K') {
//        			source.row = i;
//        			source.col = j;
//        		}
        	}
    	}
    	
    	queue.add(source);
    	QItem curr;
    	
    	while(!queue.isEmpty()) {
    		curr = queue.poll();
    		
    		if(curr.row == A && curr.col == B) {
    			return curr.dis;
    		}
    		
    		if(valid(curr.row + 1, curr.col,  N , visited)) {
    			queue.add(new QItem(curr.row + 1, curr.col, curr.dis + 1));
    			visited[curr.row+1][curr.col] = 1;
    		}
    		if(valid(curr.row - 1, curr.col,  N , visited)) {
    			queue.add(new QItem(curr.row - 1, curr.col, curr.dis + 1));
    			visited[curr.row-1][curr.col] = 1;
    		}
    		if(valid(curr.row, curr.col + 1,  N , visited)) {
    			queue.add(new QItem(curr.row, curr.col + 1, curr.dis + 1));
    			visited[curr.row][curr.col + 1] = 1;
    		}
    		if(valid(curr.row, curr.col - 1,  N , visited)) {
    			queue.add(new QItem(curr.row, curr.col - 1, curr.dis + 1));
    			visited[curr.row][curr.col - 1] = 1;
    		}
    	}
    	
    	return -1;
    	
       
    }
    
    private static boolean valid(int row, int col, int N , int[][] visited) {
    	if(row < 0 || row > N || col < 0 || col > N || visited[row][col] == 1) {
    		return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        String X;
//        char[][] grid = new char[N][N];
//        for(int i=0; i<N; i++){
//            X = sc.next();
//            for(int j=0; j<N; j++){
//                grid[i][j] = X.charAt(j);
//            }
//        }
        int N = 3;
        int A = 3;
        int B = 0;
        String X;
//        char[][] grid = new char[N][N];
//        for(int i=0; i<N; i++){
//            X = sc.next();
//            for(int j=0; j<N; j++){
//                grid[i][j] = X.charAt(j);
//            }
//        }
        
        
        char[][] grid = {{'@', '#', '@', '@'},
        				{'@', '@', '@', '@'},
        				{'#', '#', '@', '#'},
        				{'K', '@', '@', '@'}};
        
//        char[][] grid = {{'@', '#'},
//				{'@', 'K'}};
        // OUTPUT [uncomment & modify if required]
        System.out.print(numSteps(N, A, B, grid));
        sc.close();
    }
}
