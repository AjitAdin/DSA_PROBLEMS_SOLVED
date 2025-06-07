import javax.sound.midi.SysexMessage;

public class MaximumOccuringCharcter {


    public static void Check(String str){
        int maxcount=0;
        char c='/';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(maxcount<count){
                maxcount=count;
                c=str.charAt(i);

            }
        }
        System.out.println(c);
    }

// 
    public static void main(String args[]){
        String str="takeuforward";
        Check(str);
    }
}


// O(n+K) n=lenght of the string and k=length of the array

// class Main {
//     public static void Check(String str) {
//         int[] arr = new int[26];
//         // Count frequencies of lowercase letters
//         for (char c : str.toLowerCase().toCharArray()) {
//             if (c >= 'a' && c <= 'z') { // Only process lowercase letters
//                 arr[c - 'a']++;
//             }
//         }
//         int max = 0;
//         int index = 0;
//         // Find the maximum frequency
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 index = i;
//             }
//         }
//         // Print the maximum frequency and the corresponding letter
//         if (max > 0) {
//             System.out.println("Max frequency: " + max + " (Letter: " + (char) (index + 'a') + ")");
//         } else {
//             System.out.println("No valid letters found");
//         }
//     }
    
//     public static void main(String[] args) {
//         String str = "abcddda";
//         Check(str);
//     }
// }


// tc=	O(n + k) (usually O(n)) sc=O(n)
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        String str = "aabcdddeee";
        
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();
        
        // Initialize the map to count occurrences of each character
        HashMap<Character, Integer> mp = new HashMap<>();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Ignore non-letter characters (optional)
            if (!Character.isLetter(c)) {
                continue;  // Skip non-letter characters
            }
            
            // Update the frequency of the character
            int count = mp.getOrDefault(c, 0);
            mp.put(c, count + 1);
        }
        
        // Variables to track the character with the highest frequency
        int max = 0;
        char charval = '\0';  // Initialize to a default value
        
        // Iterate through the map to find the character with the highest frequency
        for (char key : mp.keySet()) {
            if (mp.get(key) > max) {
                max = mp.get(key);
                charval = key;
            }
        }
        
        // Output the character with the highest frequency
        System.out.println(charval);
    }
}



