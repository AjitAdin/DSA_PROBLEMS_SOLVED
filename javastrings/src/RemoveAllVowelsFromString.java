public class RemoveAllVowelsFromString{



    public static void Remove(String str){
        StringBuilder result=new StringBuilder();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String args[]){

        String str="I am very happy today";
        str=str.toLowerCase();
        Remove(str);
    }
}