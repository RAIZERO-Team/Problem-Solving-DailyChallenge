//Author: basmala mohamed

import java.util.Scanner;

public class Anton_and_Danik {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int n = X.nextInt(); 
        X.nextLine();
        String winner = X.nextLine();
        int anton = 0;
        int danik = 0;
        
        for (int i = 0; i < n; i++) {
            char result = winner.charAt(i);
            if (result == 'A') {
                anton++;
            } else if (result == 'D') {
                danik++;
            }
        }
        if (anton > danik){
            System.out.println("Anton");
        }else if (anton < danik){
            System.out.println("Danik");
        }else if (anton == danik){
            System.out.println("Friendship");
        }
    }
}