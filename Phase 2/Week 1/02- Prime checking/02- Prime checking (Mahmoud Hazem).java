//Author: Mahmoud Hazem

package org.example;
import java.lang.String;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        boolean prime = true;

        if(num <= 1){
            System.out.println("NO");
        } else if (num == 2) {
            System.out.println("YES");
        }else{
            for (long i = 2; i*i <= num; i++){
                if(num % i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}