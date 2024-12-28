
//Remove All Duplicates from a String
//
//
//22
//
//        0
//Problem Statement: Given a String remove all the duplicate characters from the given String.
//
//Examples:
//
//Example 1:
//Input: s = "bcabc"
//Output: “bca"
//
//Explanation: Duplicate Characters are removed
//Example 2:
//Input: s = "cbacdcbc"
//Output: "cbad"
//Explanation: Duplicate Characters are removed

public class RemoveAllDuplicatesfromaString{


    public static void Remove(String str){

        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }

            if(!isDuplicate){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String args[]){

        String str="caabbdacdcbc";
        Remove(str);
    }
}