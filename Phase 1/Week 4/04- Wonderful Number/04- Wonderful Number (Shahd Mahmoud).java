//Author: Shahd Mahmoud
package wonderful.number;

import java.util.Scanner;

public class WonderfulNumber {

    public static boolean isBinaryPalindrome(int n) {

        String binaryRepresentation = Integer.toBinaryString(n);

        String reversebinaryRepresentation = new StringBuilder(binaryRepresentation).reverse().toString();
        return binaryRepresentation.equals(reversebinaryRepresentation);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 != 0 && isBinaryPalindrome(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
