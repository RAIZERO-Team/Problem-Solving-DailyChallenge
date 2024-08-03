//Author :omnia zedan
import java.util.Scanner;


public class TimonAndPumba{

    
    public static void main(String[] args) {
       
        Scanner in =new Scanner (System.in);
       long a=in.nextLong();
       long b=in.nextLong();
       long sub=a-b;
       if(sub>=0){
           System.out.println(sub);
           
       }
       else{
           System.out.println("0");
       }
           
       
    } 
}