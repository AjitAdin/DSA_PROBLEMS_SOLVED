arr = [1, 2, 1,9, 3, 3, 4,4, 888]

print("Array:", arr)

visited = [False] * len(arr)

for i in range(len(arr)):
    if visited[i]:
        continue

    count = 1
    for j in range(i + 1, len(arr)):
        if arr[i] == arr[j]:
            count += 1
            visited[j] = True  # mark duplicate as visited

    print(f"Frequency of {arr[i]} is: {count}")
print(visited)
