public class DiamondPattern  {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<n;i++){

            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=(2*i);k++){
                System.out.print("*");

            }

            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int k=i;k<=n-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


