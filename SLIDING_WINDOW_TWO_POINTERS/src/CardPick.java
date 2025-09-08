import java.util.*;
import java.lang.*;
import java.io.*;

class CardPick
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr={6,2,3,4,7,2,1,7,1};

        int  max_score=0;
        int k=4;
        for(int i=0;i<k;i++){
            max_score+=arr[i];
        }

        int l=k-1;
        int r=arr.length-1;
        int curr_Score=max_score;

        while(l>=0){
            max_score=max_score-arr[l]+arr[r];
            r--;
            l--;
            curr_Score=Math.max(max_score,curr_Score);
            System.out.println(curr_Score);
        }

// 		System.out.println(max_score);


    }
}


// same
class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        total=sum(cardPoints[:k])
        Max=total
        r=len(cardPoints)-1
        l=k-1
        while(l>=0):
            
            total-=cardPoints[l]
            total+=cardPoints[r]
            Max=max(Max,total)
            l-=1
            r-=1


            

        return Max


    // diff appraoch 
    from typing import List

def maxScore(cardPoints: List[int], k: int) -> int:
    n = len(cardPoints)
    Max = 0

    for i in range(k + 1):
        total = 0

        # Sum first i cards from start
        for j in range(i):
            total += cardPoints[j]

        # Sum last k-i cards from end
        for j in range(n - (k - i), n):
            if j >= 0:   # handle case when k-i = 0
                total += cardPoints[j]

        Max = max(Max, total)

    return Max

# Example
cardPoints = [1, 2, 3, 4, 5, 6, 1]
k = 3
print(maxScore(cardPoints, k))  # Output: 12
