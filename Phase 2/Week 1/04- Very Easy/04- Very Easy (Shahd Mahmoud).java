//Author: Shahd Mahmoud
package very.easy;

import java.util.Scanner;

public class VeryEasy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        long n = in.nextLong();
        long sum = Math.abs(n + m);
        System.out.println(sum);
    }

}
