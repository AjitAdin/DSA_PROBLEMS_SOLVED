public class DecimalToBinary{
    public static void main(String args[]){
        StringBuilder binary=new StringBuilder();
        int decimal=11;
        while(decimal>0){
            if(decimal%2==0){
                binary.append('0');
            }
            else{
                binary.append('1');
            }
            decimal=decimal/2;
        }

        binary.reverse();
        System.out.println(binary);
    }
}

//BUILT IN FUNCTION FOR THIS

//class Main {
//    public static void main(String[] args) {
//        int decimal = 11;
//        String binary = Integer.toBinaryString(decimal);
//        System.out.println(binary);
//    }
//}



//RECURRSIVE APPROACH
//class Main {
//    public static void main(String[] args) {
//        int decimal = 11;
//        System.out.println(decimalToBinary(decimal));
//    }
//
//    static String decimalToBinary(int decimal) {
//        if (decimal == 0) {
//            return "";
//        }
//        return decimalToBinary(decimal / 2) + (decimal % 2);
//    }
//}
