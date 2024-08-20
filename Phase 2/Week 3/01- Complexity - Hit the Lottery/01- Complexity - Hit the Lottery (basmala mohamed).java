// Author: basmala mohamed

import java.util.Scanner;

public class HitTheLottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;

        if (n >= 100) {
            count += n / 100;
            n = n % 100;
        }
        if (n >= 20) {
            count += n / 20;
            n = n % 20;
        }
        if (n >= 10) {
            count += n / 10;
            n = n % 10;
        }
        if (n >= 5) {
            count += n / 5;
            n = n % 5;
        }
        if (n >= 1) {
            count += n;
        }
        System.out.println(count); //Time Complexity = O(1)
    }
}