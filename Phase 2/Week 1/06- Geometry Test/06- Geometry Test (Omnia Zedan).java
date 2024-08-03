//Author : Omnia Zedan
import java.util.Scanner;

public class GeometryTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       long R = in.nextLong();
        long S = in.nextLong();
        
       
        double r = 2 * R;
        double s = S * Math.sqrt(2);
          if (r >= s) {
            System.out.println("Circle");
        } else if (S >= r) {
            System.out.println("Square");
        } else {
            System.out.println("Complex");
        }
        
       
    }
}