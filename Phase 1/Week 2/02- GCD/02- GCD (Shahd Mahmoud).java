//Author: Shahd Mahmoud
package gcd.question;

import java.util.Scanner;

public class GcdQuestion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min;
        int max;
        int gcd = 0;
        if (a >= b) {//12 8
            max = a;//max = 12
            min = b;// min = 8
        } else {
            max = b;//max =8
            min = a;//min=12
        }
        for (int i = 1; i <= max; i++) {// 1<12  2<12 3<12 4<12 6<12
            if (a % i == 0 && b % i == 0) {//(12%1&8%1, 12%2&8%2 ,12%4&8%4)-->yes, 12%6&8%6->no
                gcd = i; //1-> 2-> 4
            }
        }
        System.out.println(gcd);//4
    }

}

