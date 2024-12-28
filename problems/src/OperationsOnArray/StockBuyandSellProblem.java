package OperationsOnArray;
//Stock Buy and Sell Problem
public class StockBuyandSellProblem {
	static void ToatalProfitOfStock(int arr[],int n) {
		int buy=arr[0];
		int temp=arr[0];
		int sum=0;
		int dayprofit;
		for(int i=0;i<n;i++) {
			if(i==(n-1)) {
				int sell=arr[n-1];
				dayprofit=sell-buy;
				sum+=dayprofit;
			}
			else if(temp<arr[i+1]) {
				temp=arr[i+1];
			}
			else {
				int sell=temp;
				dayprofit=sell-buy;
				sum+=dayprofit;
				buy=arr[i+1];
				
			}
		}
		System.out.println(sum);
		
	}
     public static void main(String args[]) {
//    	 int arr[]= {1,5,3,8,12};
    	 int arr[]= {100,180,260,310,40,535,695};
    	 int n=arr.length;
    	 ToatalProfitOfStock(arr,n);
     }
}

//eifficient approach (problem solved of array index out of bound i thi sbecause here we use the arr[i-1])
//instead ofarr[i+1]
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//class GFG 
//{ 
//    
//
//    static int maxProfit(int price[], int n)
//    {
//    	int profit = 0;
//
//    	for(int i = 1; i < n; i++)
//    	{
//    		if(price[i] > price[i - 1])
//    			profit += price[i] - price[i -1];
//    	}
//    
//    	return profit;
//    }
//
//
//    public static void main(String args[]) 
//    { 
//       int arr[] = {1, 5, 3, 8, 12}, n = 5;
//
//       System.out.println(maxProfit(arr, n));
//
//    } 
//
//}
//
