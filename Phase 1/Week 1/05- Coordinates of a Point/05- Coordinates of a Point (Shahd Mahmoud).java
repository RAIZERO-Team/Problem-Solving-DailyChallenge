//Author: Shahd Mahmoud

package coordinates.of.a.point;

import java.util.Scanner;
public class CoordinatesOfAPoint {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       float x = in.nextFloat();
       float y = in.nextFloat();
       if(x==0&&y==0){
           System.out.println("Origem");
       }else if (x==0&&y!=0){
           System.out.println("Eixo Y");
       }else if(x!=0&&y==0){
           System.out.println("Eixo X");
       }else if(x>0&&y>0){
           System.out.println("Q1");
       }else if (x<0&&y>0){
           System.out.println("Q2");
       }else if (x<0&&y<0){
           System.out.println("Q3");
       }else {
           System.out.println("Q4");
       }
    }
    
}
