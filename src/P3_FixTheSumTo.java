/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018 
*/

/*
3. What problems did you identify in the sumTo method below?

	int sum can't be in the for loop. Also there was no return statement
*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
		    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	     
	        sum += i;  
	      	
	       
	    }
	  return sum;
	
	}

}
