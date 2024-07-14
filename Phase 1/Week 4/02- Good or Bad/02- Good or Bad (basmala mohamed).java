// Author: basmala mohamed
 
import java.util.Scanner;
 
public class GoodORbad {
 
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int T = X.nextInt();
        
        for (int i = 0; i < T ; i++){
            String S = X.next();
            if (S.contains("010")){
                System.out.println("Good");
            }else if(S.contains("101")){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }
        }
    }
}