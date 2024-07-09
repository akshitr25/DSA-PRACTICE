package com.dsa.dp;

import java.util.Scanner;

public class DP29 { 
	public static void main(String as[])
	{
//		S-22 9 JULY OA CHALLENGE
//		P0: You are given an array A. Size = N. You start at index 1 and end at index N. Find the number of ways to reach from index 1 to index N. 
//You have to follow some conditions. 
//Each number A[i] = 1 or 2 ; if you are at index i you can make a jump of size from range [1…..A[i]] 
//-> You can visit each index utmost once. 
//		TC N, SC N
		int a[]={1,2,1,1,2},n=a.length;
		int dp[]=new int[n+1];
//		dp[i]=no of ways to reach index i
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<n;i++)
		{
			dp[i]=dp[i-1];
			if(a[i-2]==2)
				dp[i]+=dp[i-2];
		}
		System.out.println(dp[n-1]);
	}
}