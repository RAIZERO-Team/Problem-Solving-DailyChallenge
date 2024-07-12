//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();
        sc.nextLine();
        int[] Array=new int[N];
        for(int i=0;i<N;i++){
            Array[i]=sc.nextInt();
            
        }
        for(int i=0; i<N;i++){
            for(int j=0; j<N-1-i;j++){
                if(Array[j]>Array[j+1]){
                     int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<N;i++){
            System.out.print(Array[i]+" ");
        }
        
    }
    
}
