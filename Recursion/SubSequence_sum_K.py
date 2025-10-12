def solve(i,arr,res,k):
    if i==len(arr) and sum(res)==k:
        print(res)
        return
    if i==len(arr):
        return
    solve(i+1,arr,res+[arr[i]],k)
    solve(i+1,arr,res,k)
        


arr=[1,2,3]
k=3
solve(0,arr,[],k)


# beeter approach
# def solve(i, arr, res, k, current_sum):
#     # base case
#     if i == len(arr):
#         if current_sum == k:
#             print(res)
#         return
    
#     # pick the element
#     solve(i + 1, arr, res + [arr[i]], k, current_sum + arr[i])
    
#     # don't pick the element
#     solve(i + 1, arr, res, k, current_sum)


# arr = [1, 2, 3]
# k = 3
# solve(0, arr, [], k, 0)
