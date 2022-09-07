

package binarySearch;

import java.util.Arrays;
import java.util.Collections;

public class LowerBound {
//https://www.geeksforgeeks.org/implementing-upper_bound-and-lower_bound-in-c/
	public static void main(String[] args) {
		int arr[] = { 4, 6, 10, 11, 11, 11, 11, 11, 11, 11, 12, 13, 18, 20, 20 };
		
		int index = Arrays.binarySearch(arr, 23);
		System.out.println("in built function " + arr.length + " " + index);
		//Collections.binarySearch(null, null, null);
		

		int k = 11;		 
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		//int prevMid = 0;
		
		while(low < high) {
			mid = (low + high) / 2;
			//if(prevMid == mid) break;
			
			if(arr[mid] > k) {
				high = mid;
			}else if(arr[mid] <= k) {
				low = mid + 1;
			}
			//prevMid = mid;
		}
		
		
		System.out.println("Lower bound index is " + low + " and value is " + arr[low]);
	}

}
