import javax.sound.midi.SysexMessage;

public class MaximumOccuringCharcter {


    public static void Check(String str){
        int maxcount=0;
        char c='/';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(maxcount<count){
                maxcount=count;
                c=str.charAt(i);

            }
        }
        System.out.println(c);
    }

// 
    public static void main(String args[]){
        String str="takeuforward";
        Check(str);
    }
}
