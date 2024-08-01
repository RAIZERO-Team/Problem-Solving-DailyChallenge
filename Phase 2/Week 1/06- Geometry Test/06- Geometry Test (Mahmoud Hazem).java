//Author: Mahmoud Hazem

package org.example;
import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double s = input.nextDouble();

        if((2 * r) <= s){
            System.out.println("Square");

        } else if ((s * Math.sqrt(2)) <= (2 * r)) {
            System.out.println("Circle");

        }else {
            System.out.println("Complex");
        }

    }
}