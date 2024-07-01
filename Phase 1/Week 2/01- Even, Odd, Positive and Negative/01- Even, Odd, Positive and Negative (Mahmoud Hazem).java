//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int even = 0 , odd = 0 , positive = 0 , negative = 0;


        for(int i=0 ; i<x ; i++) {
            int y = input.nextInt();
            if(y > 0){
                positive++;
            }  if (y < 0) {
                negative++;
            }  if (y % 2 == 0) {
                even++;
            }  if (y % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Even: "+ even +"\n"+
                "Odd: "+ odd + "\n" +
                "Positive: "+ positive + "\n" +
                "Negative: " + negative);

    }
}