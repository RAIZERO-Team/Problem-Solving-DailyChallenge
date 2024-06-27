//Auther: omnia zedan
import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class CoordinatesOfAPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner (System.in);
        double X =in.nextDouble();
        double Y =in.nextDouble();
        if(Y>0 && X >0){
            System.out.println("Q1");
        }else if(Y>0 && X<0){
            System.out.println("Q2");
        }else if(Y<0 && X<0){
            System.out.println("Q3");
        }
        else if (Y<0 && X>0){
            System.out.println("Q4");
        } else if(( Y>0||Y<0) && X==0){
            System.out.println("Eixo Y");
        }
        else if( Y==0&&(X>0 || X<0)){
            System.out.println("Eixo X");
        }else if(Y==0&&X==0){
            System.out.println("Origem" );
        }else{
            System.out.println();
        }
    }
    
}
