//Find word with highest number of repeated letters in string
//
//
//29
//
//        0
//Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.
//
//Examples:
//
//Example 1:
//Input: string=”abcdefghij google microsoft”
//Output: google
//Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words
//
//Example 2:
//Input: string = “cameron blue”
//Output: -1
public class WordWithHighestNumberOfRepeatedLettersInString {

    public static String check(String str){

        String[] words=str.split(" ");
        String wordwithmaxrepeat="-1";
        int globalcount=1;

        for(String word:words){
          int getcurrentcount=calculatecount(word);
          if(getcurrentcount>globalcount){
              globalcount=getcurrentcount;
              wordwithmaxrepeat=word;
          }
        }
    return globalcount>1? wordwithmaxrepeat:"-1";
    }
    public static int calculatecount(String word){
        int[] charcount=new int[26];
        int maxcount=1;
        for(char c:word.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                int index=c-'a';
                charcount[index]++;
                if(charcount[index]>maxcount){
                    maxcount=charcount[index];

                }
            }

        }
        return maxcount;

    }

    public static void main(String args[]){
        String str1="ajit google microsoft";
        String str2="ajit";
        System.out.println(check(str1));
        System.out.println(check(str2));
    }
}


//method 2
import java.util.*;

class Main {

    // Returns the number of distinct repeated letters in a word
    public static int countRepeatedLetters(String word) {
        int[] freq = new int[256];
        int repeatedCount = 0;
        word = word.toLowerCase();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c]++;
            }
        }

        for (int count : freq) {
            if (count > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        String str = "abcdefghij google microsoft";
        String[] words = str.split("\\s+");

        int maxRepeated = 0;
        String result = "-1";

        for (String word : words) {
            int repeated = countRepeatedLetters(word);
            if (repeated > maxRepeated) {
                maxRepeated = repeated;
                result = word;
            }
        }

        System.out.println(result);
    }
}
