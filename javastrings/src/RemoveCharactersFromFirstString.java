//roblem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.
//
//        Examples:
//
//Example 1:
//Input: String str1 = “abcdef”
//String str2 = “cefz”
//Output: abd
//Explanation: The common characters in both strings are c, e, f.
//So after removing these characters from string 1 we get string resulting string as abd.
//
//
//        Example 2:
//Input: String str1 = “xyzpw”
//String str2 = “lmno”
//Output: xyzpw
//Explanation: As there is no common character in both the strings, string 1 remains unchanged.


public class RemoveCharactersFromFirstString{
    public static void Remove(String str1,String str2){
        StringBuilder result=new StringBuilder();

        for(int i=0;i<str1.length();i++){
            boolean flag=false;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                result.append(str1.charAt(i));
            }

        }
        System.out.println(result.toString());
    }


    public static void main(String agrs[]){
        String str1 = "abcdef";
        String str2 = "cefz";
        Remove(str1,str2);
    }
}