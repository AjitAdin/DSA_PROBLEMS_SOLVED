package Searching;

public class Binary_Search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(nums, target);
        System.out.println("Element found at index: " + result);
    }
}



//
//public class BinarySearchRecursive {
//    public static int binarySearch(int[] arr, int target, int left, int right) {
//        if (left > right)
//            return -1; // Base case: target not found
//
//        int mid = left + (right - left) / 2;
//
//        if (arr[mid] == target)
//            return mid;
//        else if (arr[mid] < target)
//            return binarySearch(arr, target, mid + 1, right);
//        else
//            return binarySearch(arr, target, left, mid - 1);
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 7, 9, 11};
//        int target = 7;
//
//        int result = binarySearch(nums, target, 0, nums.length - 1);
//        System.out.println("Element found at index: " + result);
//    }
//}



arr = [2, 4, 6, 8, 10, 12, 14]
target = 10

l, r = 0, len(arr) - 1  # use len(arr)-1

while l <= r:
    mid = (l + r) // 2
    if arr[mid] == target:
        print(mid)  # prints index of target
        break
    elif arr[mid] < target:
        l = mid + 1
    else:
        r = mid - 1



// RECUURSSIVE
    def binary_search(arr, target, l, r):
    if l > r:  # base case: not found
        return -1
    
    mid = (l + r) // 2
    
    if arr[mid] == target:
        return mid
    elif arr[mid] < target:
        return binary_search(arr, target, mid + 1, r)
    else:
        return binary_search(arr, target, l, mid - 1)


arr = [2, 4, 6, 8, 10, 12, 14]
target = 10
print(binary_search(arr, target, 0, len(arr) - 1))  # prints 4

print(binary_search(arr, 5, 0, len(arr) - 1))  # prints -1 (not found)
