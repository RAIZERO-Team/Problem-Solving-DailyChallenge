//Author : Mahmoud hazem

package org.example;
import java.lang.String;
import java.lang.*;
import java.util.Scanner;

class Lier {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a - b >=  0){
            System.out.println(a - b);
        }else{
            System.out.println(0);
        }
    }
}