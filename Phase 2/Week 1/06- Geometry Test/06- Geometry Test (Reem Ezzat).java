// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
 
            double radius=input.nextDouble();
            double sideOfSquare=input.nextDouble();
            
            double squareDiameter=Math.sqrt((Math.pow(sideOfSquare, 2))+(Math.pow(sideOfSquare, 2)));
            double circleDiameter=radius*2;
            if(circleDiameter<=sideOfSquare){
                System.out.println("Square");
            }
            else if(circleDiameter>=squareDiameter){
                System.out.println("Circle");
            }
            else{
                System.out.println("Complex");
            }
            
    }
}
