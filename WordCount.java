import java.util.Scanner;

public class WordCount {
    public static String getUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = s.nextLine();
        return sentence;
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
    String[] words = sentence.trim().split("\\s+");
    return words.length;
    }

    public static void main(String[] args) {
        String sentence = getUserInput();
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }

}