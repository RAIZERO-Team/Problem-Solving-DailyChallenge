//Author: omnia zedan
import java.util.Scanner;


public class Searching {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
      boolean val =false;
        ;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
 int num=in.nextInt();
        for (int j = 0 ; j < n; j++) {
       if(arr[j]==num){
             
       System.out.println(j);
       val=true;
             break; 
            }}
         if(val == false)
          System.out.println(" -1 ");

    }
}