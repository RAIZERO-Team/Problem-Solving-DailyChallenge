<<<<<<< HEAD
=======
//Author : Yasmeen asaad
>>>>>>> d13f349a9b2c5d289158bd0182058eed1f9be43c

import java.util.Scanner;
public class ps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
         int even=0;
         int odd=0;
         int positive=0;
         int neg=0;
        for(int i=1;i<=N;i++){
            int x=sc.nextInt();
            if(x%2==0){
                even++;
            }else{
                odd++;
            }
            
       if(x<0){
           neg++;
       }else if(x>0){
           positive++;
       }
        }
        System.out.println("Even: " +even);
          System.out.println("Odd: " +odd);
        System.out.println("Positive: " +positive);
        System.out.println("Negative: " +neg);

        
    }
    
}
