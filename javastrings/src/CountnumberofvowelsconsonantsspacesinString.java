public class CountnumberofvowelsconsonantsspacesinString{



    public static void Count(String str){
        int vowels=0, consonants=0,whitespace=0;
        for(int i=0;i<str.length();i++){


            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u'){
                //  System.out.println(str.charAt(i));
                vowels++;
            }
            else if(str.charAt(i)==' '){
                whitespace++;
            }
            else{
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(whitespace);

    }

    public static void main(String args[]){
        String str="Take u forward is Awesome";
        str=str.toLowerCase();
        Count(str);
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