// Author: basmala mohamed

import java.util.Scanner;

public class WonderfulNumbers {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int N = X.nextInt();
        
        if (Odd(N) && BinaryRepresentation(N)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    
    public static boolean Odd(int N) {
        return N % 2 != 0;
    }
    
    public static boolean BinaryRepresentation(int N) {
        String binaryNumber = Integer.toBinaryString(N);
        String reversedBinary = new StringBuilder(binaryNumber).reverse().toString();
        return binaryNumber.equals(reversedBinary);
    }
}