//Author : Mahmoud Hazem

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt(),
            no1 = 0,
            no2 = 1;


            for (int i = 1; i <= x; i++) {
                if(i == 1){
                    System.out.print(no1 + " ");
                } else if (i == 2) {
                    System.out.print(no2 + " ");
                } else if (i >= 3) {
                    int fibo = no1 + no2;
                    System.out.print(fibo + " ");
                    no1 = no2;
                    no2 = fibo;
                }
        }
    }
}
