//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class GeometryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int R = sc.nextInt(); 
        int S = sc.nextInt();
        if (R * 2 >= S * Math.sqrt(2)) {
            System.out.println("Circle");
        }
        else if (R * 2 <= S) {
            System.out.println("Square");
        }
        else {
            System.out.println("Complex");
        }
       
    }
    
}
