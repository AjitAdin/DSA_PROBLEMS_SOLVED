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
