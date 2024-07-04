// Author : Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int first_wieght=input.nextInt();
        int second_wieght=input.nextInt();
        
        for(int num_of_years=1;num_of_years<10;num_of_years++){
        
            first_wieght=first_wieght*3;
            second_wieght=second_wieght*2;
            if(first_wieght>second_wieght){
                System.out.println(""+num_of_years);
                break;
            }
        
        }
       
       
                                         
        

    } }