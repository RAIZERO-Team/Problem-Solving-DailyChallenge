//Author : Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class CheckCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine(); 
        
        String S = sc.nextLine();
         
        char[] array = S.toCharArray();
        
        if (array.length == A + B + 1 && array[A] == '-') {
            for (int i = 0; i < array.length; i++) {
                if (i != A && !Character.isDigit(array[i])) {
                    System.out.println("No");
                   
                    return;
                }
            }
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
    
}
