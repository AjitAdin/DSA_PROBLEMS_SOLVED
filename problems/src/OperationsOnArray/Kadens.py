arr=[-2,-3,4,-1,-2,1,5,-3]
arr=[-2,-3,-3]

max_sum=float('-inf')
start,end=0,0
for i in range(len(arr)):
    sum=0
    for j in range(i,len(arr)):
        sum+=arr[j]
        if(max_sum<sum):
            max_sum=sum
            start=i
            end=j
            
print(max_sum)
print(arr[start:end+1])



# 
arr = [-2, -3, 4, -1, -2, 1, 5, -3]

max_sum = float('-inf')
subarray = []

for i in range(len(arr)):
    s = 0
    for j in range(i, len(arr)):
        s += arr[j]
        if s > max_sum:
            max_sum = s
            subarray = arr[i:j+1]  # store the current subarray

print("Maximum Sum:", max_sum)
print("Subarray:", subarray)

# kadens algo
arr = [-2, -3, 4, -1, -2, 1, 5, -3]

max_sum = float('-inf')
s = 0
start = end = tempstart = 0

for i in range(len(arr)):
    s += arr[i]
    if max_sum < s:
        max_sum = s
        start = tempstart
        end = i
    
    if s < 0:
        s = 0
        tempstart = i + 1

print("Maximum Sum:", max_sum)
print("Subarray:", arr[start:end+1])
