// Author: Shahd Mahmoud

package watermilon;

import java.util.Scanner;
public class Watermilon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if (weight % 2==0 && weight != 2){
           System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
