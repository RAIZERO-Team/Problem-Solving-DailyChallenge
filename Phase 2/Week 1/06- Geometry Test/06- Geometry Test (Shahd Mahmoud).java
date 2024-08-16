//Author: Shahd Mahmoud

package geometry.test;
import java.util.Scanner;
public class GeometryTest {

    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       double r=in.nextDouble();
       double s=in.nextDouble();
       if(2*r<=s){
           System.out.println("Square");
       }else if(2*r>s && Math.sqrt((s*s)+(s*s))<2*r){
           System.out.println("Circle");
       }else{
           System.out.println("Complex");
       }
    }
    
}
