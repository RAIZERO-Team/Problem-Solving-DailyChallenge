//Author: basmala mohamed

import java.util.Scanner;


public class CheckCode {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int A = X.nextInt();
        int B = X.nextInt();
        X.nextLine(); 
        String S = X.nextLine();
        int Count = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '-') {
                Count++;
            }
        }
        
        boolean Length = S.length() == A + B + 1;
        boolean Dash = S.charAt(A) == '-';
        boolean Digits = Count == A + B;

        if (Length && Dash && Digits) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}