//Author: basmala mohamed 

import java.util.Scanner;


public class Last2Digits {

    public static void main(String[] args) {
         Scanner X = new Scanner(System.in);

        long A = X.nextLong();
        long B = X.nextLong();
        long C = X.nextLong();
        long D = X.nextLong();
        long resultMultiply = A%100 * B%100 * C%100 * D%100 ;
        
        long last2Digits = resultMultiply % 100;
        long Result = last2Digits%100;
        
        if(Result < 10) {
        System.out.println("0" + Result);
        }else {
        System.out.println(Result);  
        }
    }
}