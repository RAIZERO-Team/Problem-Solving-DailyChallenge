//Author: Shahd Mahmoud
package reverse.words;

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String reversedWord = new StringBuilder(words[i]).reverse().toString();

            result.append(reversedWord).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
