//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class WonderfulNum {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int N = sc.nextInt();
     if (N % 2 != 0 && isBinary(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isBinary(int N) {
        String binaryString = Integer.toBinaryString(N);
        return binaryString.equals(new StringBuilder(binaryString).reverse().toString());
    }
    
}
