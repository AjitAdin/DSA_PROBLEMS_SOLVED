public class BinaryTODecimal{
    public static void main(String args[]){
        String binary="0110";
        int l=binary.length();
        int decimal=0;
        if(binary.charAt(l-1)=='1'){
            decimal+=1;
        }
        int power=0;
        for(int i=(l-2);i>=0;i--){

//            System.out.println(power);
            if(binary.charAt(i)=='1'){
                power++;
                decimal+=Math.pow(2,power);
            }
        }
        System.out.println(decimal);
    }
}


////BUILT IN FUNCTION
//public class BinaryToDecimal {
//    public static void main(String[] args) {
//        String binary = "0110";
//        int decimal = Integer.parseInt(binary, 2); // Parse the binary string as base 2
//        System.out.println(decimal);
//    }
//}


//BETTER APPROACH
//public class BinaryToDecimal {
//    public static void main(String[] args) {
//        String binary = "0110";
//        int decimal = 0;
//
//        for (int i = 0; i < binary.length(); i++) {
//            decimal = decimal * 2 + (binary.charAt(i) - '0');
//        }
//
//        System.out.println(decimal);
//    }
//}
