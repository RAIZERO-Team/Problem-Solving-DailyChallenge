//Author :omnia zedan
import java.util.Scanner;


public class MaximumDistinctNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
       long num = in.nextLong();
        long sum = 0;
        long i;
         for (i = 1; sum + i <= num; i++) {
            sum += i;
        }

        System.out.println( (i - 1));
     
    }
}