package arrays;

// Will also work if all elements are negative. We have to include atleast 1 element in max subarray even if all elements are -ve
// Maximum Sum Rectangular Submatrix in Matrix - DP/2D using kadane - This question is advanced version kadane for 2D matrix
// https://www.youtube.com/watch?v=yCQN096CwWM
public class KadaneMaxSumSubArray {

	public static void main(String[] args) {
//		int c = Math.max(3, 3);
//		System.out.println(c); // 3
		//int arr[] = {-2, -3, 4, -1, -2, 1, 5 , -3};
		//int arr[] = {6, 2, -1 , -2, 4, -3, -2, -3};
		int arr[] = {-2, 1,-3,4,-1,-2,1,-5,4};
		int max_sum = arr[0];
		int curr_sum = arr[0];
		
		// actual start and end
		int start = 0 ,end = 0;
		// temporary start variable
		int s = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > curr_sum + arr[i]) {
				s = i;
			}
			curr_sum = Math.max(arr[i], curr_sum + arr[i]);
			
			if(max_sum < curr_sum) {
				start = s;
				end = i;
			}
			max_sum = Math.max(max_sum, curr_sum);
			
		}
		
		System.out.println("Max sum subarray value is " + max_sum);
		System.out.println("Start is "+ start + " and end is "+ end);

	}

}
