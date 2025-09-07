import java.util.Scanner;

public class LongestWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the string by spaces (handle multiple spaces)
        String[] words = input.trim().split("\\s+");

        int maxLength = 0;

        for (String word : words) {
            // Optional: Remove punctuation if needed
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        System.out.println("Length of the longest word: " + maxLength);

        scanner.close();
    }
}














public class LargestWordInString {

    public static String largestWord(String str) {
        String[] words = str.split(" ");
        String largestWord = "All same";
        int maxLength = words[0].length();

        for (String word : words) {
            int currentLength = findLength(word);
            if (maxLength < currentLength) {
                maxLength = currentLength;
                largestWord = word;
            }
        }
        return "Largest word: " + largestWord + ", Length: " + maxLength;
    }

    public static int findLength(String word) {
        return word.length();
    }

    public static void main(String args[]) {
//        String str = "Ajit Satish Adin Honnammanavar";
        String str="ajit adin";
        System.out.println(largestWord(str));
    }
}
//

s="ajit satish adin"
print(len(max(s.split(), key=len)))
print((max(s.split(), key=len)))
