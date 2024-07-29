// Author: basmala mohamed

import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        int front = 0;
        int end = n - 1;
        
        for (int i = 0; i < n ; i++) {
            array.add(sc.nextInt());
        }
        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                newArray.add(array.get(front++));
            }else {
                newArray.add(array.get(end--));
            }
        }
        for (int number : newArray) {
            System.out.print(number + " ");
        }
    }
}