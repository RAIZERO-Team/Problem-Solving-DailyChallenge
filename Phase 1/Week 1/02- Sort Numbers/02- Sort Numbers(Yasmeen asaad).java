//Author: yasmeen asaad

import java.util.Scanner;

public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
       if(A<=B&& A<=C){
           if(B<C){
               System.out.print(A + "\n" + B + "\n" + C +"\n");
           }else{
               System.out.print(A + "\n" + C + "\n" + B + "\n");
           }
       }else if(B <= A && B<= C)
               {
                   if(A<=C){
                       System.out.print(B + "\n" + A + "\n" + C +"\n");
                   }else{
                       System.out.print(B + "\n" + C + "\n" + A +"\n");
                   }
               }else if(C <= A && C<= B)
               {
                   if(A<=B){
                       System.out.print(C + "\n" + A + "\n" + B +"\n");
                   }else{
                       System.out.print(C + "\n" + B + "\n" + A +"\n");
                   }
               }
        System.out.println();
        System.out.print(A + "\n" + B + "\n" + C +"\n");
    }
    
}
