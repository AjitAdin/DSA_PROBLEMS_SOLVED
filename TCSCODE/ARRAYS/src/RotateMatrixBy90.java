// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class RotateMatrixBy90 {
    public static void RotateMatrixBy90(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };



        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){ // j starts from i+1 to avoid redundant swaps
                int temp1 = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp1;
            }
        }

        int temp;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
        System.out.println("\n\n");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}