//Write a program that calculates the factorial of a number entered by the user. 
//The factorial of a number is the product of all positive integers from 1 to the number itself.

import java.util.Scanner;


public class Main {
	public static void main (String [] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println ("Hello, please give me a positive number and I will calculate the factorial: ");

	int number = sc.nextInt();
	int factorial = 1;

	for (int n = 1; n <= number; n++) {
		factorial *= n;
	}

	System.out.printf("The factorial until number %d is %d", number, factorial);










	}
}