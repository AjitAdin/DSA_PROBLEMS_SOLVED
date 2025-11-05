//Change every letter with next lexicographic alphabet
//
//
//16
//
//        0
//Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)
//
//Examples:
//
//Example 1:
//Input: string str = “abcdxyz”
//Output: bcdeyza
//Explanation:
//
//Example 2:
//Input: string str = “Java”
//Output: Kbwb
//Explanation:


public class ChangEeveryLetterwithNextLexicographicAlphabet {

    public static void Change(String str){

        char[] charcters=str.toCharArray();
        for(int i=0;i<charcters.length;i++){
            char tempChar=charcters[i];
            if(tempChar=='z'){
                tempChar='a';
            }
            else if (tempChar == 'Z') {
                tempChar = 'A';
            } else if (Character.isLetter(tempChar)) {
                tempChar++;
            }
            charcters[i]=tempChar;
        }
     System.out.println(new String(charcters));
    }

    public static void main(String args[]){
///see anothe r methods in the takeuforward website
        String str="abcdxyz";
        Change(str);

    }

}




// logic

import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "abcdxyzABCXYZ0123456789"; // Example input with lowercase, uppercase, and digits
        
        // Convert string to a character array
        char[] arr = str.toCharArray();
  
        // Print the original character array
        System.out.println(Arrays.toString(arr));
        
        // Loop through the character array to modify each character
        for (int i = 0; i < arr.length; i++) {
            char chr = arr[i];
            
            if (Character.isLowerCase(chr)) { // If the character is a lowercase letter
                int index = chr - 'a'; // Get the index relative to 'a'
                arr[i] = (char) ((index + 1) % 26 + 'a'); // Shift and wrap around if necessary
            } 
            else if (Character.isUpperCase(chr)) { // If the character is an uppercase letter
                int index = chr - 'A'; // Get the index relative to 'A'
                arr[i] = (char) ((index + 1) % 26 + 'A'); // Shift and wrap around if necessary
            }
            else if (Character.isDigit(chr)) { // If the character is a digit
                arr[i] = (char) ((chr - '0' + 1) % 10 + '0'); // Shift and wrap around from '9' to '0'
            }
        }
        
        // Print the modified character array
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));
    }
}


s = "abcdxyzABCXYZ0123456789"
new_s = []

for i in s:
    if 'a' <= i <= 'z':  # lowercase letters
        new_s.append(chr((ord(i) - ord('a') + 1) % 26 + ord('a')))
    elif 'A' <= i <= 'Z':  # uppercase letters
        new_s.append(chr((ord(i) - ord('A') + 1) % 26 + ord('A')))
    elif '0' <= i <= '9':  # digits
        new_s.append(chr((ord(i) - ord('0') + 1) % 10 + ord('0')))
    else:
        new_s.append(i)  # leave other characters unchanged

print("".join(new_s))



    s = "abcdxyz"
print(s)
print("".join(chr(((ord(c.lower()) - 97 + 1) % 26) + 97) for c in s))




