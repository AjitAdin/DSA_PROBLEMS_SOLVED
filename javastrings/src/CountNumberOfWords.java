public class CountNumberOfWords {


    public static int count(String str){

       int count=0;
       String[] words=str.split(" ");
       for(String word:words){

           count++;

       }
       return count;
    }

    public static void main(String args[]){
        String str="HI AMRMY AND DEFENSE";
        System.out.println(count(str));
    }
}
