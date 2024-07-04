//Author : Mahmoud Hazem

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int games = input.nextInt();
        input.nextLine();
        String letters = input.nextLine();
        int D = 0,
            A = 0;
        for (int i = 0 ; i < games ; i++) {
            char winner = letters.charAt(i);
            if(winner == 'D'){
                D++;
            } else if (winner == 'A') {
                A++;
            }
        }
        if(D > A){
            System.out.println("Danik");
        } else if (A > D) {
            System.out.println("Anton");
        } else if (A == D) {
            System.out.println("Friendship");
        }

    }
}