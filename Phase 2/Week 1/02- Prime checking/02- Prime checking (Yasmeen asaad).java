//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class PrimeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
                  if(n<=1){
               System.out.println("NO");
           }else if(n==2){
               System.out.println("YES");
           }else if(n%2==0){
               System.out.println("NO");
           }else{
               boolean Prime = true;
                for (int j = 3; j * j <= n; j += 2) {
                    if (n% j == 0) {
                        System.out.println("NO");
                        Prime = false;
                     
                    }
                }
                if (Prime) {
                    System.out.println("YES");
           }
       }
    }
    
}
