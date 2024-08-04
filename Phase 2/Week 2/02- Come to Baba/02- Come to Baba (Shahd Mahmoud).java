//Author: Shahd Mahmoud

package come.to.baba;

import java.util.Scanner;

public class ComeToBaba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();// area of circle
        double r = Math.sqrt(n / 3.14); // radious of circle
        double square_diameter = 2 * r;
        double area_square = 0.5 * square_diameter * square_diameter;
        System.out.println(String.format("%.3f", n - area_square));// area of green parts =n-area_square

    }

}
