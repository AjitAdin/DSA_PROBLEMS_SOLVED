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
