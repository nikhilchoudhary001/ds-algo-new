package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarrayGreaterThanK_Leetcode862 {

	public static void main(String[] args) {
		//int[] nums = {2,-1,2};
		int[] nums = {2,7,3,-8,4,10};

		System.out.println(Integer.MIN_VALUE - 100000);
		System.out.println(shortestSubarray(nums, 12));
	}
	
	 public static int shortestSubarray(int[] nums, int k) {
	        int min = Integer.MAX_VALUE;
	        int len = nums.length;
	        int i = 1;
	        int sum = 0;
	        
	        Deque<Pair> q = new ArrayDeque<>();
	        q.add(new Pair(nums[0], 0));
	        sum = nums[0];
	        if(sum >= k) {
	            min = 1;
	            return min;
	        } 
	        
	        while(i < len){
	            sum += nums[i];
	            if(sum >= k) min = Math.min(min, i + 1);
	            while(!q.isEmpty() && q.peekLast().sum >= sum) {
	                q.removeLast();
	            }
	            q.addLast(new Pair(sum, i));
	            // {2,7,3,-8,4,10}; // 2,0 4,3 8,4 18,5
	            while(!q.isEmpty() && q.peekLast().sum - q.peekFirst().sum >= k) {
	            	min = Math.min(min, q.peekLast().index - q.peekFirst().index);
	                q.removeFirst();
	            }
	            
	            i++;
	        }
	        
	        return min == Integer.MAX_VALUE ? -1 : min;
	    }
	}

	class Pair{
	    int sum;
	    int index;
	    
	    Pair(int sum, int index){
	        this.sum = sum;
	        this.index = index;
	    }

}
