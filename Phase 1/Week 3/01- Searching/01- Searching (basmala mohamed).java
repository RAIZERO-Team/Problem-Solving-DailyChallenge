//Author: basmala mohamed

import java.util.Scanner;


public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == X) {
                System.out.println(i);
                found = true;
                break;
            }
        }if (!found) {
            System.out.println("-1");
        }
    }
}