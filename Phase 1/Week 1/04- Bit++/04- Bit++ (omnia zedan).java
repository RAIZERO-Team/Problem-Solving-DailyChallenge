//Auther : omnia zeedan
import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner (System.in);
        int x=0;
        int input=in.nextInt();
        for(int i=0;i< input;i++){
        String  s =in.next();
        if(s.contentEquals("++X") || s.contentEquals("X++")){
            x++;
                    
        }else{
            --x;
        }}
    
    System.out.println(x);
}
    }