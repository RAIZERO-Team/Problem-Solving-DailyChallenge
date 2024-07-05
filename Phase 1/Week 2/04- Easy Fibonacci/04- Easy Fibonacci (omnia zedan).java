//Author: omnia zedan
import java.util.Scanner;


public class EasyFibonacci {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner (System.in);
        int n=in.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3=0;
        for(int i=0;i<n ;i++){
            if(i==0 || i==1){
                System.out.print(i);
            }else{
              fib3=fib1+fib2;
              fib1=fib2;
              fib2=fib3;
              System.out.print(fib3);
            }
            
        }
        
}}
        
    