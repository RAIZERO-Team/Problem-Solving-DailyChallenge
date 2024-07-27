// Author: basmala mohamed

import java.util.Scanner;
 
public class Six {
 
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        long N = X.nextLong();
 
        int smallest = 0;
        long largest = (N / 6) * 6;
 
        System.out.println("The biggest is" + " " + largest);
        System.out.println("The smallest is" + " " + smallest);
    }
}