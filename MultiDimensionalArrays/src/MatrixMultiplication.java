public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] arr2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Check if the number of columns in arr1 matches the number of rows in arr2
        if (arr1[0].length != arr2.length) {
            System.out.println("Error: Matrices cannot be multiplied.");
            return;
        }

        // Initialize the result matrix with dimensions (arr1's rows x arr2's columns)
        int[][] result = new int[arr1.length][arr2[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < arr1.length; i++) {            // Iterate over rows of arr1
            for (int j = 0; j < arr2[0].length; j++) {     // Iterate over columns of arr2
                for (int k = 0; k < arr1[0].length; k++) { // Iterate over elements for summation
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Display the resulting matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
