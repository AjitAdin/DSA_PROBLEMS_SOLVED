class Main {
    String str;

    Main(String str) {
        this.str = str;
    }

    public void reverseString() {
        String[] words = str.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]);

           
            if (i != 0) {
                reverseString.append(" ");
            }
        }

        System.out.println(reverseString);
    }
}

class ReverseWordsInString {
    public static void main(String args[]) {
        String str = "hello ajit how are you";
        Main obj = new Main(str); 
        obj.reverseString();
    }
}




//
class Main {
    
  public static String rev(String s){
       StringBuilder rev=new StringBuilder();
       for(int i=0;i<s.length();i++){
           rev.append(s.charAt(i));
       }
       return rev.reverse().toString();
  }
   
    
    public static void main(String[] args) {
        String s="hello ajit how are you";
        StringBuilder res=new StringBuilder();
        String[] str=s.split(" ");
        for(String st:str){
            
            String temp=rev(st);
            res.append(temp);
            
        }
        System.out.println(res.toString());
    }
}
