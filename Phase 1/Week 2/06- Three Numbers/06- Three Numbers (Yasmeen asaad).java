//Author : Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class ThreeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count = 0;
        int K = sc.nextInt();
        int S = sc.nextInt();
        
       
        for (int x = 0; x <= K; x++) {
            
            for (int y = 0; y <= K; y++) {
                int Z = S - x - y;
                
                
                if (Z >= 0 && Z <= K) {
                    count++;
                }
            }
        }
        
       
        System.out.println(count);
    
    }
}
