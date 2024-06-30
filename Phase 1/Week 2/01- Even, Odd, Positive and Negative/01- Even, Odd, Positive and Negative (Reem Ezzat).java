// Author: Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int even=0;
        int odd=0;
        int positive=0;
        int negative=0;
        for(int i=0;i<n;i++){
        int number=input.nextInt();
            
           if(number%2==0){
            even++;
              if(number>0){
              positive++;
                          }
              else if(number<0){
               negative++;
                              }
        }
           
            else{
            odd++;
                if(number>0){
                positive++;
                            }
              else if(number<0){
               negative++;
                               }
          }
            
        }    
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
            
            
                                         
        

    } }