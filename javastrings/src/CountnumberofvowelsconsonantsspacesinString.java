public class CountNumberOfVowelsConsonantsSpacesInString {

    public static void count(String str) {
        int vowels = 0, consonants = 0, whitespace = 0;

        // Loop through the string and check each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = Character.toLowerCase(c);  // Convert character to lowercase for uniformity

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c == ' ') {
                whitespace++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Whitespaces: " + whitespace);
    }

    public static void main(String args[]) {
        String str = "Take u forward is Awesome";
        count(str);  // No need to convert string to lowercase here, it's handled inside the count function
    }
}




// 2nd imp
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    
    if ("aeiou".indexOf(c) != -1) {
        vowels++;
    } else if (Character.isLetter(c)) {
        consonants++;
    } else if (Character.isWhitespace(c)) {
        whitespaces++;
    }
}

//Count number of vowels, consonants, spaces in String
//
//
//19
//
//        0
//Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.
//
//        Examples:
//
//Example 1:
//Input: string str=”Take u forward is Awesome”
//Output:
//Vowels: 10
//Consonants: 11
//White spaces: 4
//Explanation:


def count_vowels_consonants_spaces(s):
    vowels = 0
    consonants = 0
    whitespaces = 0

    for ch in s:
        c = ch.lower()  # convert to lowercase for uniform checking

        if c in 'aeiou':
            vowels += 1
        elif c == ' ':
            whitespaces += 1
        elif c.isalpha():
            consonants += 1

    print("Vowels:", vowels)
    print("Consonants:", consonants)
    print("Whitespaces:", whitespaces)


# Example usage
s = "Take u forward is Awesome"
count_vowels_consonants_spaces(s)

