// Author: omnia zedan
import java.util.Scanner;
public class SortNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        
        
         System.out.println("enter value");
    for( int i=0;i<3;i++ ){
       
        arr[i]=in.nextInt();
       
    }
     System.out.println("numbers before sorting");
    for(int i=0;i<3 ;i++){
     System.out.println(arr[i]);
     
}
     System.out.println("numbers after sorting");
  sortnumber(arr) ; 
  for(int i=0;i<3;i++){
      System.out.println(arr[i]);
  }
    }
    static void sortnumber(int[]arr){
    int v1=0;
  for(int i =0;i<3;i++){
      for(int j=1;j<3-i;j++){
          if(arr[j-1]>arr[j]){
             v1=arr[j-1];
             arr[j-1]=arr[j];
             arr[j]=v1;
           
          }
              
          
      
      }
    
    }} } 