//Author: basmala mohamed

import java.util.Scanner;


public class Bear_and_big_brother {

    public static void main(String[] args) {
        Scanner X= new Scanner(System.in);
        
        int A = X.nextInt();
        int B = X.nextInt();
        int Y = 0;
        
        while (A <= B) {
            A *= 3;
            B *= 2;
            Y++;
        }
        System.out.println(Y);
    }
}