package test;

public class SecondMax {

	public static void main(String[] args) {
		int a[] = { 40 , 40,  10 , 2};
				
				int maxElement = findMax(a);
				System.out.println("Sec Max element is " + maxElement);

	}

	private static int findMax(int[] arr) {
		
		int maxele = Integer.MIN_VALUE;  
		int secMax = Integer.MIN_VALUE;  
		
		for(int i = 0; i < arr.length; i++) {   
			if(maxele < arr[i]) {   
				secMax = maxele;
				maxele = arr[i];
			}else if(maxele != arr[i] && secMax < arr[i]) {
					secMax = arr[i];
			}
		}
		
		return secMax;
		
	}

}
