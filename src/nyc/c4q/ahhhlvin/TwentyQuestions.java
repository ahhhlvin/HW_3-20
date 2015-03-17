package nyc.c4q.ahhhlvin;

import java.util.Random;
import java.util.Scanner;

public class TwentyQuestions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String stars = "********************************";
        int guess;
        int randomInteger = random.nextInt(100000);
        // specifies that randomInteger will be an 'int' and not a double within the range of 0-100,000!

        System.out.println(stars);
        System.out.println("Welcome to the 20 questions game! You will have 20 chances to guess a randomly selected integer between 1 -  100,000, and with each incorrect guess you will get a clue as to whether you need to guess higher or lower to reach the secret number! -- Let's begin! ");
        System.out.println(stars);

        for (int i = 19; i >= 0; i--) {

             System.out.println("\nPlease enter your guess: ");
            guess = input.nextInt();

            if (guess <= 0 || guess > 100000) {
                System.out.println("Your guess is outside of the range provided. ");
                continue;
            } else if (guess < randomInteger) {
                System.out.println("Your guess is too low! You have " + i + " guesses remaining.");
                continue;
            } else if (guess > randomInteger) {
                System.out.println("Your guess is too high! You have " + i + " guesses remaining.");
                continue;
            } else {
                    System.out.println("You have guessed correct! The random number was " + randomInteger);
                }
            }

        System.out.println("Thank you for playing and feel free to try again! :)");


        }










    }


