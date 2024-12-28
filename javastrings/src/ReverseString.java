public class ReverseString {

    public static void reverse(String s){
        String temp="";
        for(int i=s.length()-1; i>=0; i--){
         temp+=s.charAt((i));
        }
        System.out.println((temp));
    }

    public static void main(String args[]){
        String s="ajit";
        reverse(s);
    }
}
