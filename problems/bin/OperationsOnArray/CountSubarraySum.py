arr=[1,2,3,-3,1,1,1,4,2,-3]
k=3

count=0
freq={0:1}  
prefix_sum=0
for i in range(len(arr)):
    prefix_sum+=arr[i]
    
    rem=prefix_sum-k
    if rem in freq:
        count+=freq[rem]
    freq[prefix_sum]=freq.get(prefix_sum,0)+1

print(count)


# 
def count_subarrays_bruteforce(arr, k):
    n = len(arr)
    count = 0
    for i in range(n):          # starting index
        curr_sum = 0
        for j in range(i, n):   # ending index
            curr_sum += arr[j]
            if curr_sum == k:
                count += 1
    return count

# Example
arr = [1,2,3,-3,1,1,1,4,2,-3]
k = 3
print(count_subarrays_bruteforce(arr, k))  # Output: 8
