
public class SumDouble {

	public static void main(String[] args) {
		
		System.out.println(sumDouble(1, 2)); // 3
		System.out.println(sumDouble(3, 2)); // 5
		System.out.println(sumDouble(2, 2)); // 8

	} // end main method
	
//	Given two int values, return their sum. 
//	Unless the two values are the same, then return double their sum.
	
//	sumDouble(1, 2) → 3
//	sumDouble(3, 2) → 5
//	sumDouble(2, 2) → 8
	
	public static int sumDouble(int a, int b) {
		  
		if (a == b) {
			return (a+b) * 2;
		} else {
			return a+b;
		}
		
	} // end sum method

} // end class
