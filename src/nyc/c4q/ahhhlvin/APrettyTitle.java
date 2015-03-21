package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/16/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 * Capitalizes and underlines a title string input using a symbol that is also included in the input
 *
 */

import java.util.Scanner;

public class APrettyTitle {
    public static void main(String[] args) {

        printTitle("a tale of two cities", '*');




    }


    public static String printTitle(String title, char symbol) {


        Scanner input = new Scanner(title);

        String sepWord;   // variable
        String finalResult = ""; // initialize as empty
        String word;


        while (input.hasNext()) {
            word = input.next();


            sepWord = word.substring(0, 1).toUpperCase() + word.substring(1);



            finalResult += sepWord + " ";


        }

        System.out.println(finalResult);


        for (int i = 0; i < finalResult.length()-1; i++) {
            if (title.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(symbol);
            }

        }

        return finalResult;


/*
    public static String firstCap(String text) {
        Scanner input = new Scanner(text);

        String sepWord;
        String finalResult = ""; // initialize as empty
        String word;



        while (input.hasNext()) {
            word = input.next();


            sepWord = word.substring(0, 1).toUpperCase() + word.substring(1);


            finalResult += sepWord + " ";


        }


        return finalResult;
*/

    }
}
