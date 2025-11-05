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


// hash approach
s = "takeuforward"


hash = {}

# Count frequency of each character
for i in s:
    hash[i] = hash.get(i, 0) + 1

# Find the max frequency
max_freq = max(hash.values())



# Find the first character in the string with that frequency
for ch in s:
    if hash[ch] == max_freq:
        print("Most frequent character:", ch)
        break



// No need second loop
    s = "takeuforward"

hash = {}
max_freq = 0
res = ''

for ch in s:
    hash[ch] = hash.get(ch, 0) + 1
    if hash[ch] > max_freq:
        max_freq = hash[ch]
        res = ch
# no need for a second loop
print("Most frequent character:", res)


    // 
    def max_occurring_char(s):
    max_count = 0
    max_char = ''
    
    for i in range(len(s)):
        count = 0
        for j in range(len(s)):
            if s[i] == s[j]:
                count += 1
        if count > max_count:
            max_count = count
            max_char = s[i]
    
    return max_char


# Example usage
s = "takeuforward"
print("Maximum occurring character:", max_occurring_char(s))

//  vimp
    s = "takeuforward"

# Only lowercase English letters → 26 possible chars
freq = [0] * 26

# Count frequencies
for ch in s:
    freq[ord(ch) - ord('a')] += 1

# Find most frequent char
max_count = 0
max_char = ''
for ch in s:
    index = ord(ch) - ord('a')
    if freq[index] > max_count:
        max_count = freq[index]
        max_char = ch

print(max_char)
print(max_count)
