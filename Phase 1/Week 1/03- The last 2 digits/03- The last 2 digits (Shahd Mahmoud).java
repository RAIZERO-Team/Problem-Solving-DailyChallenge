//Author: Shahd Mahmoud
package the.last.pkg2.digit;

import java.util.Scanner;

public class TheLast2Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();
        long multi = (a % 100) * (b % 100) * (c % 100) * (d % 100);
       

        if (multi%100 < 10) {
            System.out.println("0" + multi%100);
        } else {
            System.out.println(multi%100);
        }
    }
}

