def solve(i, arr, f):
    if i == len(arr):
        print(f)
        return
    # pick the element
    solve(i + 1, arr, f + [arr[i]])
    # don't pick the element
    solve(i + 1, arr, f)


def main():
    arr = [3, 1, 2]
    print("All possible subsequences are:")
    solve(0, arr, [])


if __name__ == "__main__":
    main()


# 🧩 Final Answer
# Measure	Complexity
# Time Complexity	
# 𝑂
# (
# 𝑛
# ⋅
# 2
# 𝑛
# )
# O(n⋅2
# n
# )
# Space Complexity	
# 𝑂
# (
# 𝑛
# )
# O(n)