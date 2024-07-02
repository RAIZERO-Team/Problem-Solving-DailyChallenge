//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(),
            y = input.nextInt(),
            counter = 0;

        if (y < x){
            int z;
            z = x;
            x = y;
            y = z;
        }
        while (x <= y){
            x *= 3;
            y *= 2;
            counter++;
        }
        System.out.println(counter);

    }
}
