package arrays;

public class KadaneMaxProductSubarray {

	public static void main(String[] args) {
		int nums[] = {6,3,-10,0,2, 9 , 2};
		
		//maxProduct(nums);
		//maxProductn2Complexity(nums);
		int res = maxProductOnComplexity(nums);
		
		System.out.println("Max product subarray value is " + res);
	}
	
  private static int maxProductOnComplexity(int[] nums) {
	  int maxTillHere = nums[0];
      int minTillHere = nums[0];
      int max = nums[0];
      
      int temp = 0;
      
	    for(int i = 1; i < nums.length; i++){
	      temp = maxTillHere;
	      maxTillHere = Math.max(nums[i], Math.max(maxTillHere * nums[i], minTillHere*nums[i]));
	      minTillHere = Math.min(nums[i], Math.min(temp * nums[i], minTillHere*nums[i]));
	      max = Math.max(max, maxTillHere);
	    }
                     
      return max; 
		
	}

private static int maxProductn2Complexity(int[] nums) {
	  int sum = 1;
      int max = Integer.MIN_VALUE;
      
      for(int i = 0; i < nums.length - 1; i++){
          sum = nums[i];
          max = Math.max(max, sum);
          for(int j = i + 1; j < nums.length; j++){
              sum *= nums[j];
              max = Math.max(max, sum);
      }
          
      }
      
      max = Math.max(max, nums[nums.length-1]);
      
      return max;
		
	}

public static int maxProduct(int[] nums) {
	int max = nums[0];
	int min = nums[0];
	int prev_val = 1;
        if(nums[0] != 0){
            prev_val = nums[0];
        }
        
        
        for(int i = 1; i < nums.length; i++){
            
            if(nums[0] == 0){
                if(max < 0){
                     max = Math.max(max, nums[0]);
                }
                 prev_val =  1;
                continue;
            }
           
            if(prev_val < 0 && nums[0] < 0){
                max = prev_val * nums[0];
            }else if(prev_val < 0 && nums[0] > 0){
                 max = Math.max(max, nums[0]);
                 min = prev_val * nums[0];
            }else if(prev_val > 0 && nums[0] > 0){
                max = Math.max(max, prev_val * nums[0]);
            }else{
                min = prev_val * nums[0];
            }
            
            prev_val = prev_val * nums[0];
            
        }
        
        return max;
    }

}
