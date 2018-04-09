import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

/*
1. Fill out the table for the loop below for the user inputs:
4 3 5 2 6

	
	enter 4:
	enter 3: 3 is < 4 so AV is now 3
	enter 5: 3<5 so AV stays 3
	enter 2: 2<3 SO AV is now 2
	enter 6: 2<6 so AV stays 2 
	final AV value of 2
	
	
	
*/

/*
2. What is does this algorithm accomplish? (i.e., what does it compute or find?)
 It keeps the number that is smallest. When you enter a smaller number then that will be the new
 accumulated value.

*/

public class P1_FollowTheCumulativeLoop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int accumulatorVariable = Integer.MAX_VALUE;
		for( int numberIndex = 1; numberIndex <= 5; numberIndex++ ) {
			
			// Enter the values in this order: 4 3 5 2 6
			System.out.print("Enter number " + numberIndex + ": ");
			int nextInputValue = input.nextInt();
			
			if( nextInputValue < accumulatorVariable ) {
				accumulatorVariable = nextInputValue;
			}
		}
		
		System.out.println("The accumulated value is: " + accumulatorVariable);

	}
}
