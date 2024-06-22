// Author : Reem Ezzat

import java.util.Scanner;

public class Problem_Solving {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int w=input.nextInt();
        if (w==1||w==2||w%2!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    
}
