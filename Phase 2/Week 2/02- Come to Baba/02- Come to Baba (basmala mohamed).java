// Author: basmala mohamed

import java.util.Scanner;

public class ComeToBaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double circleArea = sc.nextDouble();
        double radius = Math.sqrt(circleArea / 3.14);
        double greenParts = circleArea - (2 * radius * radius);
        
        System.out.printf("%.3f\n", greenParts);
    }
}