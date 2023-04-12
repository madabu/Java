//Exercise: Write a program that generates a multiplication table

//Prompt the user to enter a number
//Create a nested loop that iterates through the numbers 1 to 10
//Multiply each number by the user's input number
//Print out the result of each multiplication in a formatted table

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number and I will give you the multiplication table for it \n" +
                            "from 1 to 10: ");

        int number = input.nextInt();

        System.out.println("Here is the multiplication table for number " + number + ":");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i <= 10; i++) {
            int result = i * number;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }



    }
}

//System.out.print():
//This method prints the specified value to the console, without adding a new line at the end.
//System.out.println():
//This method prints the specified value to the console, and adds a new line character at the end.
//If you call this method multiple times, each call will print on a new line.
//System.out.printf():
//This method allows you to format a string with specified values and print it to the console
//It is similar to the printf method in C programming. You can use format specifiers to indicate where to insert values,
//such as %d for integers, %f for floating-point numbers, %s for strings.