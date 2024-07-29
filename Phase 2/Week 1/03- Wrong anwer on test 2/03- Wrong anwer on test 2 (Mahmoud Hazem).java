//Author: Mahmoud Hazem

package org.example;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        System.out.println("The biggest is" + " " + (n / 6 ) * 6);
        System.out.println("The smallest is 0");


    }
}