//Write a program that reads in a string from the user 
//and determines whether or not it is a palindrome. 
//A palindrome is a string that reads the same forward and backward.

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Please give me a word and I will tell you if it is a palindrome: ");

		String word = sc.nextLine();

		int beginningOfWord = 0;
		int endOfWord = word.length() - 1; //because counting starts at 0

		boolean isPalindrome = true;

		while (beginningOfWord < endOfWord) {
			if (word.charAt(beginningOfWord) != word.charAt(endOfWord)) {
				isPalindrome = false;
				break;
			}
			beginningOfWord++;
			endOfWord--;
		}

		if (isPalindrome) {
			System.out.println(word + " is a palindrome.");
		}
		else {
			System.out.println(word + " is not a palindrome.");
		}

	}
}
