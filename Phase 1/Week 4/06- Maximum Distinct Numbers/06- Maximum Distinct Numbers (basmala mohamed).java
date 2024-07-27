// Author: basmala mohamed

import java.util.Scanner;

public class MaximumDistinctNumbers {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        long N = X.nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1 ; sum+i <= N ; i++) {
            sum += i;
            count++;
        }
        System.out.println(count);
    }
}