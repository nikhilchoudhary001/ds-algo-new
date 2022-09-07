package StringProblems;

import java.util.Arrays;

public class LCSubsequence {
	
	static int result;
	static String str1 = "abhjyptr";   //abc
	static String str2 = "zrjbhptr"; //bc// o/p should be bhtr

	public static void main(String[] args) {	
//		String test = "ab";
//		System.out.println(test.substring(2));
		
		int dp[][] = new int[str1.length()][str2.length()];
		for(int[] r : dp) {
			Arrays.fill(r, -1);
		}
		
		result = findLCS(str1,str2, 0 , 0, dp);
		
		System.out.println("Max length of common subsequence is "+ result);
	}

	private static int findLCS(String s1, String s2, int i1, int i2, int[][] dp) {
		
		if(s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if(dp[i1][i2] != -1) {
			return dp[i1][i2];
		}
		if(str1.charAt(i1) == str2.charAt(i2)) {
//			curr++;
//			result = Math.max(result, curr);
//			if(i1 < s1.length() && i2 < s2.length())
			return dp[i1][i2] = 1 + findLCS(str1.substring(i1 + 1), str2.substring(i2 + 1), i1 + 1, i2 + 1 , dp);
		}else {
			return dp[i1][i2] = Math.max(findLCS(str1.substring(i1), str2.substring(i2 + 1), i1, i2 + 1 , dp), 
					findLCS(str1.substring(i1 + 1), str2.substring(i2), i1 + 1, i2 , dp)) ;
		}
		
//		if(i2 < str2.length() && i1 < str1.length()) {
//			return Math.max(findLCS(str1.substring(i1), str2.substring(i2 + 1), i1, i2 + 1 , curr), 
//					findLCS(str1.substring(i1 + 1), str2.substring(i2), i1 + 1, i2 , curr)) ; 
//		}
		
	}

}
