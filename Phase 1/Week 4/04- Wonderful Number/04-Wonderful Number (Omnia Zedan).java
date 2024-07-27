//Author:omnia zedan
import java.util.Scanner;
/**
 *
 * @author 3M.T
 */
public class WonderfulNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
     
           Scanner in = new Scanner(System.in);
           
           int num=in.nextInt();
           String binarynum=Integer.toBinaryString(num);
          int l=0;
          int R=binarynum.length()-1;
          boolean value=true;
          while(l<R){
             if (binarynum.charAt(l) != binarynum.charAt(R)) {
                value= false;
                break;
            }
            l++;
            R--;
        
          }
         if(value&&num%2!=0){
    System.out.println("YES");
         }else{
             System.out.println("NO");
         }
          }}