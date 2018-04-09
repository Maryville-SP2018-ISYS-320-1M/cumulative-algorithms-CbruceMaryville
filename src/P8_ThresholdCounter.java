import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018 
*/

public class P8_ThresholdCounter {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many numbers are in the series? : ");
		int series = console.nextInt();
		System.out.print("What is your number threshold : ");
		int thresh = console.nextInt();
		int count = 0;
		for(int i =0; i < series; i ++) {
			
			System.out.println("Please type number : " + (i+1));
				if(console.nextInt() > thresh) {
					count ++;
				}
		}
		System.out.println("The count of numbers above the threshold is : " + count);
	}

}
