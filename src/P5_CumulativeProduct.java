//AM COMPLETELY STUCK ON THIS ONE BRAIN IS FRIED
//Tried using an array but my brain says im fried =
import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018 
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to multiply? : ");
		int multi = console.nextInt();
		
		int[] finalprod = new int[50];
		for(int i =0; i < multi; i ++) {
			System.out.println("Enter number :" + i);
			int nums;
			nums = console.nextInt();
			finalprod[i] = nums;
		}
		int endingnum =1;
		for(int i = 0 i<finalprod.len(); i ++ {
			System.out.println(finalprod[i]);
			
			//endingnum *= finalprod[i];
			//System.out.println("Final product is: " + endingnum);
		}
		
	}

}
