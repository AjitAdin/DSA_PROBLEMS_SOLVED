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
