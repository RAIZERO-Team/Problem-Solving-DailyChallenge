//Author: Yasmeen asaad
import java.util.Scanner;


public class Last2Digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       long A=sc.nextInt();
       long B=sc.nextInt();
       long C=sc.nextInt();
       long D=sc.nextInt();
       
      
        A=A%100;
        B=B%100;
        C=C%100;
        D=D%100;
        long multiable = (A *B *C *D)%100 ;
        if(multiable<10){
            System.out.println("0" + multiable);
        }else{
            System.out.println(multiable);
        }
       
    }
    
}
