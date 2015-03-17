package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/16/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class APrettyTitle {
    public static void main(String[] args) {

        printTitle("a tale of two cities", '*');


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

/*
    public static String firstCap(String s) {

        for(int j = 0; j < s.length(); j++) {

            if (s.charAt(j) != ' ' && s.charAt(j + 1) == ' ') {
                System.out.println(s.substring(j, j++).toUpperCase() + s.substring(j++).toLowerCase());
            } else return s;
        }
    }
*/

}
