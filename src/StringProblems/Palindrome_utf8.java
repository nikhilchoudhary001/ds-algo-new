package StringProblems;

public class Palindrome_utf8 {

	public static void main(String[] args) {
		//String s = "£ह€€ह£ह";
		String s = "£ह€€ह£ह";
		
		int len = s.length();
		System.out.println(len);
		
		for(int i = 0; i < len / 2 ; i++) {
			if(s.charAt(i) != s.charAt(len - 1 - i)) System.out.println(" Not a Palindrome");
		}
		
		System.out.println("Palindrome");
	}

}
