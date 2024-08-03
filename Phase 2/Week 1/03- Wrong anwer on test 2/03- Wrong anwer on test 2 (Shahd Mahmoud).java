//Author: Shahd Mahmoud
package wrong.anwer.on.test.pkg2;

import java.util.Scanner;

public class WrongAnwerOnTest2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long divisible = (n / 6) * 6;
        System.out.println("The biggest is " + divisible);
        System.out.println("The smallest is " + 0);
    }

}
