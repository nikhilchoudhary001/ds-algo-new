package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidindWindowMaximum_Lc239 {

	public static void main(String[] args) {
		// Asked in MMT
		int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
		int frame = 3;
		int res[] = new int[arr.length - frame + 1];
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b - a);
//		pq.add(-1);
//		pq.add(-3);
//		pq.add(-5);
//		pq.add(7);
//		
//		System.out.println(pq.poll() + " " + pq.poll() + " " + pq.poll() + " " + pq.poll() + " ");
		
		int curr = 0;
		while(curr < frame) {
			pq.add(arr[curr]);
			curr++;
		}
		
		int temp = 0;
		// This soln can be optimized further using deque. See fraz sheet HEAP HARD question
		while(curr < arr.length) {
			res[temp] = pq.peek();
			pq.remove(arr[temp]);
			pq.add(arr[curr]);
			curr++;
			temp++;
			System.out.println(pq);
		}
		res[temp] = pq.peek();
		
		for(int i : res) {
			System.out.print(i + " ");
		}
		
	}

}

//Vinod Kumar Kanchi
//Asked in MMT

//Given an Array A and frame size S.
//Output the Array B which has the maximum value for each frame length in A, moving one step to the right of the array each turn.
//
//Input:
//
//A = [1 3 -1 -3 5 3 6 7]
//
//S = 3
//
//
//Output:
//
//B = [3, 3, 5, 5, 6, 7]
//
//
//[1  3  -1] -3  5  3  6  7    31 [3  -1  -3] 5  3  6  7    31  3 [-1  -3  5] 3  6  7    51  3  -1 [-3  5  3] 6  7    51  3  -1  -3 [5  3  6] 7    61  3  -1  -3  5 [3  6  7]    7
//
//
