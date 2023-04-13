//Write a program that calculates the sum of the even numbers between 1 and 100 (inclusive).

public class Main {
  public static void main(String[] args) {

int sumOfEvenNumbers = 0;

for (int i = 1; i <= 100; i++) {
	if (i % 2 == 0){ 
		sumOfEvenNumbers += i;
	}
}

System.out.println ("The sum of the even numbers between 1 and 100 is: " + sumOfEvenNumbers);

}