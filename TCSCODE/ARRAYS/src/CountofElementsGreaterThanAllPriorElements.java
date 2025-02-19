class CountofElementsGreaterThanAllPriorElements {
    public static void main(String[] args) {
        int arr[] = {7, 4, 8, 2, 9};  // Example input

        int count = 1;  // First element is always counted
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // If a new max is found
                max = arr[i];
                count++;  // Increase count
            }
        }

        System.out.println(count);  // Print result
    }
}
