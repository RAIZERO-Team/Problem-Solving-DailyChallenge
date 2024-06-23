//Author: basmala mohamed

import static java.util.Arrays.sort;
import java.util.Scanner;


public class SortNumbers {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int A = X.nextInt();
        int B = X.nextInt();
        int C = X.nextInt();
        int[] numbers = {A, B, C};

        sort(numbers);
        
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }   
}