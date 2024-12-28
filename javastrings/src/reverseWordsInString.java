

class Main{
    String str;
    Main(String str){
        this.str=str;
    }

    public void reverseString(){
        String[] words=str.split(" ");
        StringBuilder reverseString=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            reverseString.append(words[i]);



            //add the space in between the word if not the last word

            if(i!=0){
                reverseString.append(" ");
            }


        }
        System.out.println(reverseString);


    }
}

public class reverseWordsInString{
    public static void main(String args[]){
        String str="hello ajit how are you";
        Main obj=new Main(str);
        obj.reverseString();


    }
}