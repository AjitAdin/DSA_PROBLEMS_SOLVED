class FindMax:
    @staticmethod
    def find_max(arr, i=0):
        # Base case
        if i == len(arr) - 1:
            return arr[i]
        
        # Recursive case
        return max(arr[i], FindMax.find_max(arr, i + 1))


# Example usage
if __name__ == "__main__":
    arr = [1, 4, 3, -5, -4, 8, 6]
    print("Maximum element:", FindMax.find_max(arr))
