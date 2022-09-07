package test;

public class StringPermutation {

	public static void main(String[] args) {
		String s = "ABC";
		
		permute(s, "");

	}

	private static void permute(String s, String part) {
		
		if(s == "") {
			System.out.println(part);
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			String n = s.substring(0, i) + s.substring(i+1);
			
			permute(n, part + c);
		}
		
	}

}
