//Author: Mahmoud Hazem

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();
        int countLw = 0,
            countUp = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                countLw++;
            } else {
                countUp++;
            }
        }

        if(countUp > countLw){
            str = str.toUpperCase();
        }else {
            str = str.toLowerCase();
        }
        System.out.println(str);
    }
}