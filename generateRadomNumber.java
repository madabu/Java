//Write a Java program that generates and prints out a random number between 1 and 100 (inclusive).
//Use the Random class to generate the random number.

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.printf("The random number I've generated for you is: %d ", randomNumber);



    }
}