def merge_sort(arr, low, high):
    if low >= high:
        return
    mid = (low + high) // 2
    merge_sort(arr, low, mid)   #-> R
    merge_sort(arr, mid + 1, high) # ->L
    merge(arr, low, mid, high)


def merge(arr, low, mid, high):
    temp = []
    left = low
    
    right = mid + 1

    while left <= mid and right <= high:
        if arr[left] <= arr[right]:
            temp.append(arr[left])
            left += 1
        else:
            temp.append(arr[right])
            right += 1
            


    while left <= mid:
        temp.append(arr[left])
        left += 1
    while right <= high:
        temp.append(arr[right])
        right += 1

    # ✅ Fix: include 'high' in the range
    for i in range(low, high + 1):
        arr[i] = temp[i - low]


arr = [3, 2, 4, 1, 3]
merge_sort(arr, 0, len(arr) - 1)

print(arr)
