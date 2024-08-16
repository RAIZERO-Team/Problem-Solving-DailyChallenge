//Author: Shahd Mahmoud
package print.digit.pkgfor.recursion;

import java.util.Scanner;

public class PrintDigitForRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String number = Integer.toString(n);

            for (int j = 0; j < number.length(); j++) {

                char digit = number.charAt(j);
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}
