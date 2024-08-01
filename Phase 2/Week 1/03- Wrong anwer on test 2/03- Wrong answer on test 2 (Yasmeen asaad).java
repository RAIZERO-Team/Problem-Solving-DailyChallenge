//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class WrongAnswer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       long N = sc.nextLong();
      
      long biggest = (N / 6) * 6 ;
        System.out.println("The biggest is"+" " +biggest);
        System.out.println("The smallest is 0");
    }
    
}
