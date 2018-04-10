
//Fixed in Class is working now!!
import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018 
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int count = console.nextInt();
		
		int product = 1;
		
		for (int i = 1; i <= count; i++) {
		System.out.print("Enter the next number : " + i + " ");
		int num = console.nextInt();
		product *= num;
		}
		
		
		System.out.println("Product = " + product); 
		}
}



