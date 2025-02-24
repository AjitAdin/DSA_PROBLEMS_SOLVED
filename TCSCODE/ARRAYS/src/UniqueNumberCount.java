public class UniqueNumberCount {
    public static void main(String[] args) {
        int arr[]={4,1,3,2,1,2,9};
        int n=arr.length;
        int flag;

        for(int i=0;i<n;i++){
            flag=0;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    flag=1;
                    break;

                }
            }
            if(flag==0){
                System.out.println(arr[i]);
            }
        }
    }
}


