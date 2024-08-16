// Author: basmala mohamed

import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T ; i++) {
            long N = sc.nextLong();
            
            String number = Long.toString(N);
            int length = number.length();
            
            for (int j = 0; j < length ; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(number.charAt(j));
            }
            System.out.println(" ");
        }
    }
}