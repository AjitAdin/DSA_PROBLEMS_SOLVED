def second_largest(arr):
    if len(arr) < 2:
        return None  # Not enough elements

    first = second = float('-inf')

    for num in arr:
        if num > first:
            second = first
            first = num
        elif num > second and num != first:
            second = num

    return second if second != float('-inf') else None

# Example usage
arr = [10, 20, 20, 30, 30]
print(second_largest(arr))  # Output: 20
