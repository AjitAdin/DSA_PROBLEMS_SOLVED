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


//
s="I am very happy today"
new_s=[]

for i in s.lower():
    if i!='a' and i!='e' and i!='i' and i!='o' and i!='u':
        new_s.append(i)
print("".join(new_s))


def remove_all_vowels(text: str) -> str:
    vowels = "aeiouAEIOU"
    return "".join(char for char in text if char not in vowels)

# Example usage
s = "Remove all vowels from this string"
result = remove_all_vowels(s)
print(result)  # Output: Rmv ll vwls frm ths strng
