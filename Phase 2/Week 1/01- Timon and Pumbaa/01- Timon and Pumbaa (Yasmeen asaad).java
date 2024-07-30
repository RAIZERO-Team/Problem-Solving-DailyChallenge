//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class TimonAndPumpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a-b>=0){
           System.out.println(a-b);
       }else if(a-b<0){
           System.out.println("0");
       }
    }
    
}
