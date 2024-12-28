import java.util.Arrays;
public class Anagram {

    public static boolean checkAnagram(String s1,String s2){
       char[] s1CharArray=s1.toCharArray();
       char[] s2CharArray=s2.toCharArray();


      Arrays.sort(s1CharArray);
      Arrays.sort(s2CharArray);
     return Arrays.equals(s1CharArray,s2CharArray);
    }

    public static  void main(String args[]){
                  String a="silent";
                  String b="listen";
                System.out.println( checkAnagram(a,b));


    }
}
