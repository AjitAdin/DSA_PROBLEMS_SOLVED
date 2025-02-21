public class Main {
    public static int thirdMax(int[] nums) {
        Integer firstMax = null, secondMax = null, thirdMax = null;

        for (int num : nums) {
            if (num == firstMax || num == secondMax || num == thirdMax) {
                continue; // Skip duplicates
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        // Fix: Ensure no null values are unboxed
        if (thirdMax != null) {
            return thirdMax;
        } else if (firstMax != null) {
            return firstMax;
        } else {
            return 0; // Default return in case of an empty array
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        System.out.println(thirdMax(arr1)); // Output: 1

        int[] arr2 = {2, 2, 3, 1};
        System.out.println(thirdMax(arr2)); // Output: 1

        int[] arr3 = {1, 2}; // Less than 3 distinct numbers
        System.out.println(thirdMax(arr3)); // Output: 2

        int[] arr4 = {}; // Empty array
        System.out.println(thirdMax(arr4)); // Output: 0
    }
}
