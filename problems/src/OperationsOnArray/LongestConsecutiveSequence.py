class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        arr=set(nums)
        max_count=0
        
        for i in range(len(arr)-1):
            count=1

            for j in range(i,len(arr)-1):
                if arr[j]-arr[j+1]==-1:
                    count+=1
                else:
                    break
            max_count=max(max_count,count)
        return max_count

                    
            


