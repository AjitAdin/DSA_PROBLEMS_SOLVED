class Solution:
    def longestSubarray(self, arr, k):
        max_len = 0

        for i in range(len(arr)):       # start index
            sum = 0
            for j in range(i, len(arr)): # end index
                sum += arr[j]
                if sum == k:
                    max_len = max(max_len, j - i + 1)
                if sum > k:   # <-- only works if array has non-negatives
                    break

        return max_len if max_len else 0
    
# sliding window approach works for only +ve values

def longest_subarray_sum_k(arr, K):
    start = 0
    current_sum = 0
    max_len = 0

    for end in range(len(arr)):
        current_sum += arr[end]

        while current_sum > K and start <= end:
            current_sum -= arr[start]
            start += 1

        if current_sum == K:
            max_len = max(max_len, end - start + 1)

    return max_len

# Example
arr = [1, 2, 3, 2, 5]
K = 5
print(longest_subarray_sum_k(arr, K))  # Output: 2




# Both positive +negative
# prefix+hashmap
arr = [1,2,3,1,1,1,4,2,3]
k = 3

prefix_sum = {}
max_len = 0
sum = 0

for i in range(len(arr)):
    sum += arr[i]
    
    if sum == k:
        max_len = i + 1
    
    diff = sum - k
    
    if diff in prefix_sum:
        max_len = max(max_len, i - prefix_sum[diff])
    
    if sum not in prefix_sum:
        prefix_sum[sum] = i

print(max_len)

# 
def longest_subarray_general(arr, k):
    prefix_sum_index = {0: -1}  # handle subarray starting at index 0
    max_len = 0
    current_sum = 0

    for i, value in enumerate(arr):
        current_sum += value
        
        # Check if there is a prefix sum that allows a subarray of sum k
        if current_sum - k in prefix_sum_index:
            max_len = max(max_len, i - prefix_sum_index[current_sum - k])
        
        # Only store first occurrence for longest subarray
        if current_sum not in prefix_sum_index:
            prefix_sum_index[current_sum] = i
    
    return max_len

# Example with negatives
arr = [10, 5, -2, 7, 1, 9]
k = 15
print(longest_subarray_general(arr, k))  # Output: 5
