//Author: omnia zedan

import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class TheLast2Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in= new Scanner(System.in);
        System.out.println("enter 4 values");
          int A=in.nextInt();
          int B=in.nextInt();
          int C=in.nextInt();
          int D=in.nextInt();
          int x=A*B*C*D;
          System.out.println(x);
           String value = String.valueOf(x);
        int []arr=new  int [value.length()];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=Character.getNumericValue(value.charAt(i));
           
        }
        System.out.println(arr[arr.length-2]+""+arr[arr.length-1]);
       
    }
    
}
