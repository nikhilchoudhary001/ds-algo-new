package testAllCompanies;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindInitialNOccurancesOfMaxRepeatingNumbersInStream {

	public static void main(String[] args) {
	
		int arr[] = {2,2,3,4,3,3,3 , 2};
		
		Map<Integer, Integer> m = new HashMap<>();
		
		m = createMap(arr);
		
		int max = 0;
		
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if(entry.getValue() > max) {
				max = Math.max(max, entry.getKey());
			}
			
		}
		
		System.out.println(max);
		
		}

	private static Map<Integer, Integer> createMap(int[] arr) {
		
		Map<Integer, Integer> occurances = new HashMap<>();
		
		for(int i = 0; i < arr.length ; i++ ) {
			if(occurances.get(arr[i]) != null) {
				occurances.put(arr[i], occurances.get(arr[i]) + 1);
			}else {
				occurances.put(arr[i], 1);
			}
			
		}
		
		return occurances;
	}
		
	}



//2 2 3 4 3  3 3
//
//2 2
//4 1
//3 4
//
//3 4 
//2 2 
//4 1



