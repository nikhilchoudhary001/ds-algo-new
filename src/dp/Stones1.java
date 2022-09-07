package dp;

import java.util.Arrays;

public class Stones1 {

	public static void main(String[] args) {
		int[] stones = {3,7,2,3};

		System.out.println("Alice wins "+ stoneGame(stones));		
	}
	
	    public static boolean stoneGame(int[] stones) {
	        int i = 0, j = stones.length;
	        
	        int[][] dp = new int[j][j];
	        for(int[] arr : dp) {
	            Arrays.fill(arr, -1);
	        }
	         int sum = 0;
	        for(int k=0; k < j; k++) {
	            sum += stones[k];
	        }
	        int ans = findAnswer(dp, i, j-1,stones);
	        if(ans > 0){
	            return true;
	        }else{
	             return false;
	        }
	       
	    }
	    
	    public static int findAnswer(int[][] dp, int i, int j, int[] stones) {
	        if(i == j)
	            return stones[j];
	        if(dp[i][j] != -1) {
	             return dp[i][j];
	        } else {
	            int x = findAnswer(dp, i, j - 1, stones);
	            int y = findAnswer(dp, i + 1, j, stones);
	            
	           return dp[i][j] = Math.max(stones[j] - x, stones[i] - y);
	        }    
	    }
}
