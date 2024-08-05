// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
       double AreaOfCircle=input.nextDouble();
       double radius=Math.sqrt(AreaOfCircle/3.14); 
       double diameterOfSquare=radius*2;
       double squareSideLength=Math.sqrt((diameterOfSquare*diameterOfSquare)/2);
      double AreaOfSquare=squareSideLength*squareSideLength;
      double AreaOfGreenParts=AreaOfCircle-AreaOfSquare;
      
        System.out.printf("%.3f",AreaOfGreenParts);
 
 
    }
}
