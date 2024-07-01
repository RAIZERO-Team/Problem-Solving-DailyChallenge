//Author: Shahd Mahmoud
package bears;

import java.util.Scanner;

public class Bears {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int numberOfyears = 0;
        while (a <= b) {

            a *= 3;
            b *= 2;
            numberOfyears++;
        }
        System.out.println(numberOfyears);

    }

}
