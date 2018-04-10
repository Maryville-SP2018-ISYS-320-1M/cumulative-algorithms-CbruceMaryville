//PART 6-7 FIXED
/*
ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018 
*/

public class P6_DoubleProblems {

	public static void main(String[] args) {
		double gpa = 3.2;
		if (Math.abs(gpa * 3 - 9.6) < 0.1) {
			System.out.println("You earned enough credts");
		} else {													// added this else for testing
			System.out.println("The condition isn't met try again");
		}
	}

}

/*
 * It isn't executing because: there is a roundoff error of about .000000001
 * By using absolute value and checking for a roundoff error we are able to verify the error and work
 * around it and meet our condition!
 * 
 */
