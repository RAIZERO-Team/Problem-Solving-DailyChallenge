 //Author: yasmeen asaad
 import java.util.Scanner;

public class Watermelon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner sc =new Scanner(System.in);
       int W=sc.nextInt();
        if (W%2==0&& W !=2){
         System.out.print("YES");
            
        }else{
            System.out.print("NO");
        }
    }
    }