
public class SleepIn {

	public static void main(String[] args) {

		System.out.println(sleepIn(false, false)); // true
		System.out.println(sleepIn(true, false)); // false
		System.out.println(sleepIn(false, true)); // true
		 
		 
		 
	} // end main method
	
	
//	The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//	We sleep in if it is not a weekday or we're on vacation. 
//	Return true if we sleep in.

	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		
		if (!weekday && !vacation) {
			return true;
		} else if (!weekday && vacation) {
			return true;
		}
		
		if (weekday) {
			if (vacation) {
				return true;
			} else if(!vacation) {
				return false;
			} else {
				return false;
			}
		}
		return false;
		  
	} // end sleepin method

} // end sleepin class
