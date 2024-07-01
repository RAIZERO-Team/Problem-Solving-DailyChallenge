//Author:Yasmeen asaad

import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class BeerAndBrother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int year=0;
       while(A<=B){
           A*=3;
           B*=2;
           year++;
       }
        System.out.println(year);
    }
    
}
