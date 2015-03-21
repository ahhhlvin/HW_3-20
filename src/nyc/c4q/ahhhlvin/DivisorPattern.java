package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/18/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 * Create an artistic pattern!
 */


import java.util.Scanner;

public class DivisorPattern {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {  // OUTER for loop starts each ROW

            for (int j = 1; j <= n; j++) {  // INNER for loop goes through the COLUMNS for each row


                if ((i % j == 0) || (j % i == 0)) { // % is called 'modulo' which means divides evenly WITHOUT any remainders
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }


            }

            System.out.println(" ");    // prints out a new line to start the next ROW


        }
    }
}