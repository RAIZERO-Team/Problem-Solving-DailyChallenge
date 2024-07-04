//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       short N=sc.nextShort();
        sc.nextLine();
        if(N==1){
            System.out.println("0");
        }else if(N==2){
            System.out.println("0" +" "+"1");
        }else{
            int arr []=new int [N];
             arr[0] = 0;
            arr[1] = 1;
             for (int i = 2; i < N; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
      }
       
    }
    
}
