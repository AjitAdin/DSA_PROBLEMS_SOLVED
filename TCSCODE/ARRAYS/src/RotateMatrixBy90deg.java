import java.util.Arrays;

class RotateMatrixBy90deg {
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(arr);

        // **Step 1: Transpose the matrix**
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) { // j starts from i+1 to avoid redundant swaps
                int temp1 = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp1;
            }
        }

        // **Step 2: Reverse each row**
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        printMatrix(arr);
    }

    // **Helper method to print the matrix properly**
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
