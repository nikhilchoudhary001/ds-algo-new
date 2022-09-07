package dp;

import java.util.HashSet;
import java.util.Set;

public class DecodeWays91 {

	public static void main(String[] args) {

			String s = "06";
		  int count = 0;
//	        if(s.startsWith("0")){
//	            System.out.println("0");
//	        }
	        count = findCount(s, 0, count);
	        System.out.println(count);
	}
	    
	    public static int findCount(String s, int index, int count){
	    	
	    	
	        if(index < s.length()){
	        	int ans = 0;
	        	int x = Integer.parseInt(s.substring(index, index+1)); 
	        	if(x > 0) {
	        		  ans += findCount(s, index + 1, count);
		           
	        	}
	        	
	        	if(index+2 <= s.length()) {
	        		int y = Integer.parseInt(s.substring(index, index+2));    
		            if(y > 0 && y <= 26 && x > 0) {
		            	ans += findCount(s, index + 2, count);
		            
		            }
	        	}
	            
	            return ans;
	            
	        }else{
	            return 1;
	        }
	    }

}
