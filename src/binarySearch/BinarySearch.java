package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 10, 11, 12, 13, 18, 20 };

		int k = 6;		 
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while(low <= high) {
			// Both will give correct answer
			//mid = low + (high - low) / 2;
			mid = (high + low) / 2;
			
			if(arr[mid] == k) {
				low = mid;
				break;
			}
			
			if(arr[mid] > k) {
				high = mid - 1;
			}else if(arr[mid] < k) {
				low = mid + 1;
			}
		}
		
		if(low < arr.length && arr[low] == k)
		System.out.println("Lower bound index is " + low + " and value is " + arr[low]);
		else System.out.println("Not found");
			

	}

}
