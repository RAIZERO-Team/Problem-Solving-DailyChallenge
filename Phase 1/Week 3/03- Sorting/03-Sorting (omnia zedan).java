//Author :omnia zedan
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new  int [n];
        for(int i=0 ;i<n;i++){
            arr[i]=in.nextInt();
        }
      sortNumber(arr,n);
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
     static void sortNumber(int[] arr,int n) {
        int v1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    v1 = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = v1;
                }
            }
        
        }}}
