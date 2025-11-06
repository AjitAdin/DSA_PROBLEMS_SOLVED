class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j] == target:
                    return [i,j]


# 
class Solution:
    def twoSum(self, nums, target):
        prev={}
        for i in range(len(nums)):    
            rem=target-nums[i]
            if rem in prev:
                return [prev[rem],i]
            prev[nums[i]]=i
        
# 
class Solution:
    def twoSum(self, nums, target):
        prev = {}  # value -> index

        for i, num in enumerate(nums):
            rem = target - num
            if rem in prev:
                return [prev[rem], i]
            prev[num] = i

                
# for sorted only
def two_sum_sorted(nums, target):
    l, r = 0, len(nums) - 1  # left and right pointers

    while l < r:
        s = nums[l] + nums[r]
        if s == target:
            return [l, r]       # found the pair
        elif s < target:
            l += 1              # need a bigger sum, move left pointer right
        else:
            r -= 1              # need a smaller sum, move right pointer left

    return []  # no pair found
