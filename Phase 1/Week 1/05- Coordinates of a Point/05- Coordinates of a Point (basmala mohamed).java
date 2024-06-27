//Author: basmala mohamed

import java.util.Scanner;

public class Coordinates_of_a_point {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);

        double x = X.nextDouble();
        double y = X.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }else if (x == 0 && y > 0) {
            System.out.println("Eixo Y");
        } else if (x == 0 && y < 0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x > 0) {
            System.out.println("Eixo X");
        } else if (y == 0 && x < 0) {
            System.out.println("Eixo X");
        } 
    }
}