package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostToClimbStairs {

	public static void main(String[] args) {
		int cost[] = {1,100,1,1,1,100,1,1,100,1};
		
		int dp[] = new int[cost.length];
		Arrays.fill(dp, -1);
		
		if(cost.length == 2)
			System.out.println("Min is "+ Math.min(cost[0], cost[1]));
		int res = findMin(cost,0,dp);
		
		System.out.println("Min is "+ Math.min(dp[0], dp[1]));

	}

	private static int findMin(int[] cost, int index, int dp[]) {
		//int x , y;
		if(dp[index] != -1) {
			return dp[index];
		}
		Map<Integer,Integer>[] m = new HashMap[5];
		m[0] = new HashMap<>();
		m[0].co
		
		if(cost.length > 0 && index == cost.length - 2 || index == cost.length - 1) {
			return dp[index] = cost[index];
//			if(index == cost.length-2) {
//				return dp[index] = Math.min(cost[cost.length-1],cost[cost.length-2]) ;
//			}else if(index == cost.length-1) {
//				return dp[index] = cost[index];
//			}
			//return dp[index] = Math.min(cost[cost.length-1],cost[cost.length-2]) ;
		}
		
		return dp[index] = Math.min(findMin(cost, index + 1, dp), findMin(cost, index + 2, dp)) + cost[index];
		
		
	}

}

// W/o DP solution
//public static void main(String[] args) {
//	
//	int cost[] = {1,100,1,1,1,100,1,1,100,1};
//    int res = findMin(cost,-1);
//        
//     return res;
//     }
// 
// 	private static int findMin(int[] cost, int index) {
//		
//		if(index == cost.length - 2 || index == cost.length - 1) {
//			return cost[index];
//		}
//		
//		if(index == -1) {
//			return Math.min(findMin(cost, index + 1), findMin(cost, index + 2));
//		}else {
//			return Math.min(findMin(cost, index + 1), findMin(cost, index + 2)) + cost[index];
//		}
//		
//	}
