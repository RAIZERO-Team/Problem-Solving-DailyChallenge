//Author: omnia zedan
import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class BearAndBigBrother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner (System.in);
        int A=in.nextInt();
        int B=in.nextInt();
   int numberOfYears;
   
            
        for (numberOfYears = 0; numberOfYears < 15; numberOfYears++) {
            if (A > B) {
                break; 
            }
            
            A = A * 3;
            B = B * 2;
        }
        
        System.out.println(numberOfYears);
    }
        
}
        
    
    