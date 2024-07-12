//Author: Yasmeen asaad

import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();
        int[] Array =new int[N];
        for(int i=0; i<N; i++){
            Array[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;  i<N;i++){
            if(Array[i]==x){
                System.out.println(i);
                return;
            }
            }
        System.out.println("-1");
        }
    }
    

