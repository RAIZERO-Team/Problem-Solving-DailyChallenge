//Author : Omnia zedan
import java.util.Scanner;


public class WrongAnwerOnTest2{

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner (System.in);
        long N=in.nextLong();
       long i;
       long smallnum=0;
        for(i=N; i>=0 ;i--){
            if(i%6==0)
                
               break; 
              
        }
       
         System.out.println("The biggest is "+i);
         System.out.println("The smallest is "+smallnum);
        
    } 
}