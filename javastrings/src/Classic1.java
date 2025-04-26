class Classic1 {
    public static void main(String args[]){
        String str="takeuforword";
        String substr="forword";
        int result=-1;
        for(int i=0;i<str.length();i++){
            int index=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(j)==substr.charAt(index)){
                    index++;
                }
                else{
                    break;
                }
            }
            result=i;
        }

        System.out.println(result);
    }

}
