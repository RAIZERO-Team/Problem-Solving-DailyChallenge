//Author: Yasmeen asaad

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();  
        
        int x = 0;  
      
        for (int i = 0; i < n; i++) {
            String statement = sc.nextLine();
            switch (statement) {
                case "++X":
                case "X++":
                    x++;
                    break;
                case "--X":
                case "X--":
                    x--;
                    break;
                default:
                    System.out.println("Invalid ");
                    break;
            }
        }

       
        System.out.println(x);
    }
}
