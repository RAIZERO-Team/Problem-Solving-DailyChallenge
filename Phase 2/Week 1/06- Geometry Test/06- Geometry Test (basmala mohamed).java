// Author: basmala mohamed

import java.util.Scanner;

public class GeometryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double R = scanner.nextDouble();
        double S = scanner.nextDouble();
        
        if ((S * Math.sqrt(2)) <= (2 * R)) {
            System.out.println("Circle");
        }else if ((2 * R) <= S) {
            System.out.println("Square");
        }else {
            System.out.println("Complex");
        }
    }
}