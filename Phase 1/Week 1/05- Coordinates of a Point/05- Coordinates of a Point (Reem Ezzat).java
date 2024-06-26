// Author: Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float coordinate_X=input.nextFloat();
        float coordinate_Y=input.nextFloat();
        
        if(coordinate_X>0&&coordinate_Y>0){
            System.out.println("Q1");
                                          }
        
        else if(coordinate_X<0&&coordinate_Y>0){
            System.out.println("Q2");
                                               }
        
        
        else if(coordinate_X<0&&coordinate_Y<0){
            System.out.println("Q3");
                                               }
        
        else if(coordinate_X>0&&coordinate_Y<0){
            System.out.println("Q4");
                                               }
        
        else if(coordinate_X==0&&coordinate_Y!=0){
            System.out.println("Eixo Y");
                                                 }
        
        else if(coordinate_X!=0&&coordinate_Y==0){
            System.out.println("Eixo X");
                                                 }
        else {
            System.out.println("Origem");
             }

    } }

