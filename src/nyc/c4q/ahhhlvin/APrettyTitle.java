package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/16/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 *
 */

import java.util.Scanner;

public class APrettyTitle {
    public static void main(String[] args) {

        printTitle(firstCap("a tale of two cities"), '*');




    }


    public static String printTitle(String title, char symbol) {


        System.out.println(title);

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(symbol);
            }

        }


        return title;

    }


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

    }
}
