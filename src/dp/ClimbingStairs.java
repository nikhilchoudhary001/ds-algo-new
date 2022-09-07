package dp;

// https://leetcode.com/problems/climbing-stairs/submissions/
public class ClimbingStairs {
	static int count = 0;
	public static void main(String[] args) {
		
		int stairs = 7;
		
		findWays(stairs);
		System.out.println("Count is "+ count);
		
		// Using DP
		
//		count = 0;
//        int arr[] = new int[n+1];
//        Arrays.fill(arr, -1);
//		findWays(n, arr);
//        
//        return arr[n];

	}
	
	// This code was not working in leetcode because they are sending 
	// multiple inputs at once and I'm using a static variable which is not starting from 0 for every new number.
	// So pls set count = 0; in line no. 6

	private static void findWays(int stairs) {
		if(stairs == 0) {
			count++;
			return;
		}else {
			if(stairs == 1) {
				findWays(stairs-1);
				return;
			}
			
			findWays(stairs-1);
			findWays(stairs-2);
		}
		
	}
	
	// DP approach	
	
//	   public static int findWays(int stairs, int arr[]) {
//	        int x = 0;
//	        int y = 0;
//	        if(arr[stairs] != -1){
//	            return arr[stairs];
//	        }
//			if(stairs == 0) {
//				return 1;
//			}else {
//				if(stairs == 1) {
//					return arr[1] = 1;
//				}
//				
//				x = findWays(stairs-1, arr);
//				y = findWays(stairs-2, arr);
//	            return arr[stairs] = x + y;
//			}
//		}

}
