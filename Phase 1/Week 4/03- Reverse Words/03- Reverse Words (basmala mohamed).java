import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] words = S.split(" ");
        StringBuilder wordResult = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            reversedWord.reverse();
            wordResult.append(" ").append(reversedWord);
        }
        System.out.println(wordResult.toString().trim());
    }
}