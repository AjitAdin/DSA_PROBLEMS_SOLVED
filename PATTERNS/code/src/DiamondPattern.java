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
        for(int i=n-1;i>=0;i--){


            for(int k=0;k<=(2*i);k++){
                System.out.print("*");

            }
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}


public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {  // Start from n-2 to avoid duplicate middle row

            for (int j = n - i - 1; j > 0; j--) { // Fix spacing in lower part
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
