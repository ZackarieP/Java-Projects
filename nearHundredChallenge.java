
public class nearHundredChallenge {

	public static void main(String[] args) {
		
		System.out.println(nearHundred(93)); // true
		System.out.println(nearHundred(90)); // true
		System.out.println(nearHundred(89)); // false

	} // end main method
	
//	Given an int n, return true if it is within 10 of 100 or 200. 
//	Note: Math.abs(num) computes the absolute value of a number.
//
//	nearHundred(93) → true
//	nearHundred(90) → true
//	nearHundred(89) → false
	
	public static boolean nearHundred(int n) {
		
		if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
			return true;
		} else {
			return false;
		}
		  
	} // end nearHundred method


} // end class
