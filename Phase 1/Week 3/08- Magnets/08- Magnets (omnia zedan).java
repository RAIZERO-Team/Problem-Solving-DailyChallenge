//Author:omnia zedan
import java.util.Scanner;
/**
 *
 * @author 3M.T
 */
public class  Magnets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String arr[]=new String [n];
       for(int i=0;i<arr.length;i++){
           arr[i]=in.next();
       } 
      
       int numofgroups=1;
       for(int j=0;j<arr.length-1;j++){
           if(!arr[j].equals(arr[j + 1]))
           numofgroups++;
       }
       System.out.println(numofgroups);
    }}