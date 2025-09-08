def third_largest(arr):
    if len(arr) < 3:
        return None  # Not enough elements
    
    first = second = third = float('-inf')  # Initialize to negative infinity
    
    for num in arr:
        if num > first:
            third = second
            second = first
            first = num
        elif num > second and num != first:
            third = second
            second = num
        elif num > third and num != second and num != first:
            third = num
    
    return third if third != float('-inf') else None

# Example usage
arr = [10, 4, 3, 50, 23, 90]
print(third_largest(arr))  # Output: 23
