//Author : basmalla

import java.util.Scanner;


public class GCD {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int A = X.nextInt();
        int B = X.nextInt();
        int result = 1;
        
        for (int i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}