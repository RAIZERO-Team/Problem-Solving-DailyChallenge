//Author: Shahd Mahmoud
package maximum.distinct.numbers;

import java.util.Scanner;

public class MaximumDistinctNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1; sum + i <= n; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println(count);
    }

}
