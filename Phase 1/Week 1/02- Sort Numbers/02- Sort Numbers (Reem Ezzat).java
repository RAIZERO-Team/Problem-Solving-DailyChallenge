// Author: Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
       
          int []arr={n1,n2,n3};
          int []arrBeforeSorting={n1,n2,n3};
          

    for(int i=0;i<2;i++){
    int min=i;

         for(int j=i+1;j<3;j++){
         if(arr[j]<arr[min]){
         min=j;
                               }
                        }
           int temb=arr[i];
            arr[i]=arr[min];
            arr[min]=temb;
}

    for(int p=0;p<3;p++){
    System.out.println(""+arr[p]);
                    }
    
        System.out.println("");
        
        for(int p=0;p<3;p++){
          System.out.println(""+arrBeforeSorting[p]);
                    }
       }
       }
