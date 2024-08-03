// Author: basmala mohamed

import java.util.Scanner;

public class EasyTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long evenNumbers;
        
        if(N % 2 == 0) {
            evenNumbers = N / 2;
        }else {
            evenNumbers = N / 2;
        }    
        System.out.println(evenNumbers);
    }
}