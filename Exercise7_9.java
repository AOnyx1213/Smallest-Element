
import java.util.Scanner;
public class Exercise7_9 {

	public static void main(String[] args) {
		double[] numbers = new double[10];
		
		// Enter ten double numbers: Scanner (System.in)
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
	
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			
		}
		// Call a method min and then display the result
		System.out.print("The Minimum numbers is " + min(numbers));
	}	
	public static double min(double[] list) {
		double m = list[0]; // m is the smallest element
		
		// for (i = 1 to list.legth -1)
		for(int i = 1; i < list.length; i++) {
		  // if (m is larger than list[i])
			if (m > list[i])
		    // list[i] is the new smallest element
				m = list[i];
		}
		//  return the smallest element, m
		return m;
	}

	}

/* Sample Run:
 Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 The minimum number is 1.5
 */
