package dp;

public class UniquePathsLeetCode62 {

	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		 if(m == 1 || n == 1){
	            System.out.println(1);
	        }else{
	            int res = findAllPaths(m-1,n-1, 0, 0);
	            System.out.println(res);
	        }

	}
	
	 public static int findAllPaths(int m, int n, int i, int j) {
	        if(i == m && j == n){
	            return 1;
	        }
	        int a = 0;
	        int b = 0;
	        
	        if(isSafe(m,n,i,j + 1)){
	            a = findAllPaths(m,n,i,j + 1);
	        }
	        if(isSafe(m,n,i + 1,j)){
	            b = findAllPaths(m,n,i + 1,j);
	        }
	        
	        return a + b;
	        
	    }
	    
	     public static boolean isSafe(int m, int n, int i, int j) {
	        if(i <= m && i >= 0 && j <= n && j >= 0){
	            return true;
	        }
	         
	        return false;
	    }

}
