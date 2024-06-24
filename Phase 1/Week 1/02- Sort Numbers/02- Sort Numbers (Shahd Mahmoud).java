//Author: Shahd Mahmoud
package sort.numbers;
import java.util.Scanner;
public class SortNumbers {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        if (a>=b&&b>=c){
            System.out.println(c+"\n"+b+"\n"+a+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");

        }else if(a>=c&&c>=b){
            System.out.println(b+"\n"+c+"\n"+a+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");
        }else if (b>=a&&a>=c){
            System.out.println(c+"\n"+a+"\n"+b+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");
        }else if(b>=c&&c>=a){
            System.out.println(a+"\n"+c+"\n"+b+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");
        }else if (c>=a&&a>=b){
            System.out.println(b+"\n"+a+"\n"+c+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");
        }else {
            System.out.println(a+"\n"+b+"\n"+c+"\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n");
        }
    }
    
}
