public class Concat2Str {
    public static void concat(String str1,String str2){
        System.out.println(str1.concat(str2));
        
        System.out.println(str1+" "+str2);
    }


    public static void main(String args[]){

        String str1="Hello";
        String str2="World";
        concat(str1,str2);
//System.out.println(str1+" "+str2);


    }
}
