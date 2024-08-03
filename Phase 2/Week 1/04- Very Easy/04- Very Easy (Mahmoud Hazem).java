//Author: Mahmoud Hazem

package org.example;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long sum = n + m;

        if (sum >= 0){
            System.out.println(sum);
        }else {
            System.out.println(-sum);
        }
    }
}