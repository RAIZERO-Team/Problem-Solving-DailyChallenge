//Author: Mahmoud Hazem


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int x = 0;
        for(int i = 0; i<=number; i++){
            String sym = input.nextLine();
            switch (sym) {
                case "X++" -> {
                    x++;
                    break;
                }
                case "++X" -> {
                    ++x;
                    break;
                }
                case "X--" -> {
                    x--;
                    break;

                }
                case "--X" -> {
                    --x;
                    break;
                }

            }


        }
        System.out.println(x);


    }
}
