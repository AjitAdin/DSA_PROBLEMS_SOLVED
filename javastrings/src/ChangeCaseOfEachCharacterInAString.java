
import java.util.*;
public class ChangeCaseOfEachCharacterInAString{


    public static void ChangeCase(String str){
        StringBuilder changecaseString=new StringBuilder();
        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(Character.isLowerCase(c)){
                changecaseString.append(Character.toUpperCase(c));

            }
            else if(Character.isUpperCase(c)){
                changecaseString.append(Character.toLowerCase(c));
            }
            else{
                changecaseString.append(c);
            }

        }

        System.out.println(changecaseString);


    }
    public static void main(String args[]){
        String str="AjIt";
        ChangeCase(str);


    }
}



