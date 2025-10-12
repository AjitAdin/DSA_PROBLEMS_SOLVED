def solve(i, arr, res, k, current_sum,count):
    # base case
    if i == len(arr):
        if current_sum == k:
            count+=1
        return
    
    # pick the element
    solve(i + 1, arr, res + [arr[i]], k, current_sum + arr[i],count)
    
    # don't pick the element
    solve(i + 1, arr, res, k, current_sum,count)


arr = [1, 2, 3]
k = 3
count=0
solve(0, arr, [], k, 0,count)
print(count)