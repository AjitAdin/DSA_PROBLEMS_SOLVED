class Solution:
    
    @staticmethod
    def partition(arr, low, high):
        pivot = arr[low]
        i = low
        j = high

        while i < j:
            while i <= high - 1 and arr[i] <= pivot:
                i += 1
            while j >= low + 1 and arr[j] > pivot:
                j -= 1
            if i < j:
                arr[i], arr[j] = arr[j], arr[i]

        arr[low], arr[j] = arr[j], arr[low]
        return j

    @staticmethod
    def qs(arr, low, high):
        if low < high:
            pIndex = Solution.partition(arr, low, high)
            Solution.qs(arr, low, pIndex - 1)
            Solution.qs(arr, pIndex + 1, high)

    @staticmethod
    def quick_sort(arr):
        Solution.qs(arr, 0, len(arr) - 1)
        return arr


# Example usage
arr = [4, 6, 2, 5, 7, 9, 1, 3]
print("Before QuickSort:", arr)
arr = Solution.quick_sort(arr)
print("After QuickSort:", arr)



# imp
def quick_sort(arr):
    def partition(arr, low, high):
        pivot = arr[low]
        i = low + 1
        j = high

        while True:
            while i <= high and arr[i] <= pivot:
                i += 1
            while j >= low and arr[j] > pivot:
                j -= 1
            if i >= j:
                break
            arr[i], arr[j] = arr[j], arr[i]

        arr[low], arr[j] = arr[j], arr[low]
        return j

    def qs(arr, low, high):
        if low < high:
            p = partition(arr, low, high)
            qs(arr, low, p - 1)
            qs(arr, p + 1, high)

    qs(arr, 0, len(arr) - 1)
    return arr


# Example usage
arr = [4, 6, 2, 5, 7, 9, 1, 3]
print("Before QuickSort:", arr)
arr = quick_sort(arr)
print("After QuickSort:", arr)
