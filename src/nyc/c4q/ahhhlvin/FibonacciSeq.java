package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/18/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args) {

        int n;
        int prev = 0;
        int next = 1;
        int sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the n'th number you would like from the Fibonacci sequence: ");
        n = input.nextInt();

        for(int i = 0; i < (n-1); i++) { // (n-2) because we skipped the first '0' and '1' in the fibonacci sequence

            sum = prev + next;
            prev = next;          // [NEW variable <--- OLD variable]     so NEXT -> PREV
            next = sum;           //                                         SUM -> NEXT

            if (i < (n-2)) {      // (n-3) because we want i to continue if it hasn't reached our 'STOP' parameter of (i < n - 2) in the 'for loop' condition
                continue;
            } else {
                System.out.println(sum);
            }
        }



    }
}
