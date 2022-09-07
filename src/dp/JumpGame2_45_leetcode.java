package dp;

import java.util.Arrays;

public class JumpGame2_45_leetcode {

	public static void main(String[] args) {
		int n[] = {2,3,1,1,4};
		System.out.println(canJump(n));

	}
	public static boolean canJump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return help(nums,0, dp);
    }
    
    public static boolean help(int nums[], int index, int dp[]){
        if(dp[index] != -1){
            return dp[index] == 1 ? true : false ;
        }
        if(index == nums.length - 1){
            return true;
        }else{
            boolean curr = false; 
            for(int i = nums[index]; i > 0; i--){
                if(index + i < nums.length){
                    curr  = curr || help(nums, index + i, dp);
                    if(curr){
                        break;
                    }
                }
            }
            
            dp[index] = curr == true ? 1 : 0;
            return curr;
        }
    }

}
