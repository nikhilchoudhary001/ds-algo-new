package StringProblems;

import java.util.Arrays;

/*
 * Shortest common subsequence -

If str1 = "geek" and str2 = "eke" . Common subsequence can be "geekeke" or "geeke". Since we need to find the shortest ans will be "geeke".

So basically , SCS will be len(str1) + len(str2) - LCS(str1,str2)
 */
public class PrintLCSAndShortestCommonSupersequence {

	static int result;
	static String str1 = "abhjyptr";   //abc
	static String str2 = "zrjbhptr"; //bc// o/p should be bhptr

	public static void main(String[] args) {
	
//		String s1 = "a";
//		s1 = s1 + "b" + s1;
//		System.out.println("s1 is " + s1);
		
		int dp[][] = new int[str1.length()+1][str2.length()+1];
		
		 LCS(str1,str2,dp);
		
		System.out.println("Max length of common supersequence is "+ dp[str1.length()][str2.length()]);
		
		printLongestCommonSubsequence(dp);
		printShortestCommonSupersequence(dp);
		
//	      z	 r  j  b  h  p  t  r
//	      [ [0, 0, 0, 0, 0, 0, 0, 0, 0],
//	       a[0, 0, 0, 0, 0, 0, 0, 0, 0],
//	       b[0, 0, 0, 0, 1, 1, 1, 1, 1],
//	       h[0, 0, 0, 0, 1, 2, 2, 2, 2],
//	       j[0, 0, 0, 1, 1, 2, 2, 2, 2],
//	       y[0, 0, 0, 1, 1, 2, 2, 2, 2],
//	       p[0, 0, 0, 1, 1, 2, 3, 3, 3],
//	       t[0, 0, 0, 1, 1, 2, 3, 4, 4],
//	       r[0, 0, 1, 1, 1, 2, 3, 4, 5]]
		
	}

	private static void printLongestCommonSubsequence(int[][] dp) {
		int i = str1.length();
		int j = str2.length();
		String lcs = "";
		
		while(i > 0 && j > 0) {
			if(str1.charAt(i-1) == str2.charAt(j-1)) {
				lcs = str1.charAt(i-1) + lcs;
				i--;
				j--;
			}else if(dp[i-1][j] < dp[i][j-1]) {
				j--;
			}else if(dp[i-1][j] > dp[i][j-1]) {
				i--;
			}else {
				i--;
			}
		}
		
		System.out.println("Longest common subsequence is " + lcs);
	}
	
	private static void printShortestCommonSupersequence(int[][] dp) {
		int i = str1.length();
		int j = str2.length();
		String scs = "";
		
		while(i > 0 && j > 0) {
			if(str1.charAt(i-1) == str2.charAt(j-1)) {
				scs = str1.charAt(i-1) + scs;
				i--;
				j--;
			}else if(dp[i-1][j] < dp[i][j-1]) {
				scs = str2.charAt(j-1) + scs;
				j--;
			}else if(dp[i-1][j] > dp[i][j-1]) {
				scs = str1.charAt(i-1) + scs;
				i--;
			}else {
				scs = str1.charAt(i-1) + scs;
				i--;
			}
		}
		
		while(i > 0) {
			scs = str1.charAt(i-1) + scs;
			i--;
		}

		while(j > 0) {
			scs = str2.charAt(j-1) + scs;
			j--;
		}
		
		System.out.println("Shortest common subsequence is " + scs);
		
	}

	private static void LCS(String s1, String s2, int[][] dp) {
		
		for(int i = 1; i < s1.length()+1; i++) {
			for(int j = 1; j < s2.length()+1 ; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
	}

}
