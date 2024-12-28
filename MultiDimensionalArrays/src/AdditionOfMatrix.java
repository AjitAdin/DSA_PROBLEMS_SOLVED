public class AdditionOfMatrix {
    public static void main(String args[]) {
        int[][] arr1 = {
                {1, 2},
                {4, 5}
        };
        int[][] arr2 = {
                {5, 6},
                {8, 9}
        };

        // Create a result array with the same dimensions as arr1 and arr2
//        arr1.length is the total number of rows in arr1.
//                arr1[0].length is the total number of columns in the first row of arr1.
        int[][] result = new int[arr1.length][arr1[0].length];

        // Add the corresponding elements of arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Display the resulting added array
        System.out.println("Added Array:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
