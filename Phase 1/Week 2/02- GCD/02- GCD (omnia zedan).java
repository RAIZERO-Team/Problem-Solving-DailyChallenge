//Author:omnia zedan
import java.util.Scanner;
import java.math.BigInteger;

public class GCD{

    
    public static void main(String[] args) {
       
        Scanner in =new Scanner (System.in);
        BigInteger A=in.nextBigInteger();
        BigInteger B=in.nextBigInteger();
        BigInteger output=A.gcd(B);
        System.out.println(output);
       
    } 
}