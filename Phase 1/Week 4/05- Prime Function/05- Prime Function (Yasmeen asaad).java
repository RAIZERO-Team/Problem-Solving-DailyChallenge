//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class PrimeNum {

    
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
       int N = sc.nextInt();
       for(int i=0 ; i<N ; i++){
           int n= sc.nextInt();
           if(n<=1){
               System.out.println("NO");
           }else if(n==2){
               System.out.println("YES");
           }else if(n%2==0){
               System.out.println("NO");
           }else{
               boolean Prime = true;
                for (int j = 3; j * j <= N; j += 2) {
                    if (N % j == 0) {
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
}