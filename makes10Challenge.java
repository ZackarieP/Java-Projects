
public class makes10Challenge {

	public static void main(String[] args) {
		
		System.out.println(makes10(9, 10)); // true
		System.out.println(makes10(9, 9)); // false
		System.out.println(makes10(1, 9)); // true

	} // end main method
	
//	Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//	makes10(9, 10) → true
//	makes10(9, 9) → false
//	makes10(1, 9) → true
	
	public static boolean makes10(int a, int b) {
		
		if (a == 10 || b == 10) {
			return true;
		} else if (a + b == 10) {
			 return true;
		} else {
			return false;
		}
		  
	} // end makes10 method

} // end class
