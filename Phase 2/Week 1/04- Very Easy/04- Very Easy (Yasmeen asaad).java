//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class VeryEasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       long N = sc.nextLong();
       long M = sc.nextLong();  
       long sum = N + M;
        System.out.println(Math.abs(sum));
    }
    
}
