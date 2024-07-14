//Author: Shahd Mahoud

package magnets;

import java.util.Scanner;
public class Magnets {

    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       String arr[]=new String [n];
       int counter=1;
       for(int i=0;i<n;i++){
           arr[i]=in.next();
       }
       
       for(int i=1;i<n;i++){
           if(arr[i].charAt(0)==arr[i-1].charAt(1)){
               counter++;
           }
       }
       System.out.println(counter);
    }
    
}
