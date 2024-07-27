//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class GoodOrBad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       int N=sc.nextInt();
       sc.nextLine();
       for(int i=0; i<N; i++){
           String S =sc.next();
           if(S.contains("010") || S.contains("101")){
               System.out.println("Good");
           }else{
               System.out.println("Bad");
           }
       }
    }
    
}
