package testAllCompanies;

import java.util.HashSet;
import java.util.Set;

public class CiscoFindValidWordInSentence {
public static void main(String[] args) {
		
		String str = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
		int res = howMany(str);
		System.out.println();
		System.out.println(res);
		
	}
	
	public static int howMany(String sentence) {
	    String srr[] = sentence.split(" ");
	    int count = 0;
	    Set<Character> s = new HashSet<>();
	    for(int j = 65; j <= 90; j++){
	            s.add((char)j);
	    }
	    for(int j = 96; j <= 122; j++){
	            s.add((char)j);
	    }
	   s.add('.');
	   s.add(',');
	   s.add('?');
	   s.add('!');
	   s.add('-');
	   
	   System.out.println(String.valueOf(Math.floor(13 / 5)));
	   
	   int len = 0;
	   System.out.println();
	    
	    for(int i = 0; i < srr.length; i++){
	        len = 0;
	        if(srr[i].trim().length() == 0){
	             continue;
	        }
	               
	        for(int j = 0; j < srr[i].length(); j++){
	            if(s.contains(srr[i].charAt(j))){
	                ++len;
	            }
	        }
	        
	        if(len == srr[i].length()){
	            System.out.print(srr[i] + " ");
	            count++;
	        }
	    }
	    
	    return count;
	    }

}
