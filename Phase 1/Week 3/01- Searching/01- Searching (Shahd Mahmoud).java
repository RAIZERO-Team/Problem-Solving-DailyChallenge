//Author: Shahd Mahmoud

package searching;

import java.util.Scanner;
public class Searching {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int search_number=in.nextInt();
        for(int i=0;i<n;i++){
        
            if(arr[i]==search_number){
                System.out.println(i);
               
                break;
            }else if(i==n-1&&arr[i]!=search_number){
                System.out.println("-1");
             }
        }
    }
    
}
