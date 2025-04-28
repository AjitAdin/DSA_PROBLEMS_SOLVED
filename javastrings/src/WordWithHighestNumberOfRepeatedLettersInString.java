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
// import java.util.*;

// class Main {

//     public static int maxLetterFrequency(String s) {
//         int[] freq = new int[128]; // 128 is enough for basic ASCII
//         int maxFreq = 0;
        
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             freq[ch]++;
//             if (freq[ch] > maxFreq) {
//                 maxFreq = freq[ch];
//             }
//         }
//         return maxFreq;
//     }
    
//     public static void main(String args[]) {
//         String s = "abcdefghij google microooosoft";
//         String[] arr = s.trim().split("\\s+");
//         int max = 0;
//         String res = "";
        
//         for (String word : arr) {
//             int count = maxLetterFrequency(word);
//             if (count > max) {
//                 max = count;
//                 res = word;
//             }
//         }
        
//         System.out.println(res);
//     }
// }
