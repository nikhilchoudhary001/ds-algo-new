package bitManipulation;

public class DivideTwoIntegers_Leetcode_29 {

	public static void main(String[] args) {
		//System.out.println(3 << 0 << 1);
		System.out.println((10 + 55.5) / 2);
		System.out.println(divide(10, 3));

	}
	
    public static int divide(int A, int B) {
        if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
        int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++);
            res += 1 << x;
            a -= b << x;
        }
        return (A > 0) == (B > 0) ? res : -res;
    }

}
