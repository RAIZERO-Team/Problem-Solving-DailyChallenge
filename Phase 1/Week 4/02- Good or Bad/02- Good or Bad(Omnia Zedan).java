//Author:omnia zedan
import java.util.Scanner;
/**
 *
 * @author 3M.T
 */
public class GoodOrBad {

    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner in = new Scanner(System.in);

  int n = in.nextInt(); in.nextLine();
      
        for (int j = 0; j < n; j++) {
            String input = in.nextLine();
            boolean Good = false;

            
            for (int i = 0; i < input.length() - 2; i++) {
                if ((input.charAt(i) == '0' && input.charAt(i + 1) == '1' && input.charAt(i + 2) == '0') ||
                    (input.charAt(i) == '1' && input.charAt(i + 1) == '0' && input.charAt(i + 2) == '1')) {
                    Good = true;
                    break;
                }
            }

            if (Good) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }}