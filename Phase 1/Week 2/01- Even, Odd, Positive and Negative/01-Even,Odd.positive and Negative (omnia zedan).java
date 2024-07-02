//Author:omnia zedan
import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
     int n =in.nextInt();
         int even=0;
         int odd=0;
         int positive=0;
         int negative=0;
        for(int i=0 ;i<n;i++){
            int num =in.nextInt();
            if (num % 2==0){
                even++;
            }else  if(num %2!=0){
                odd++;}
            if(num>0){
                positive++;
            }else if(num<0){
             negative++;  } 
        }
        
       System.out.println("Even: " +even);
          System.out.println("Odd: " +odd);
        System.out.println("Positive: " +positive);
        System.out.println("Negative: " +negative);
 
        
        
        
        
        
        
        
    }
    
}
