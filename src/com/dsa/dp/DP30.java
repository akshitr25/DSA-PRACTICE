package com.dsa.dp;

import java.util.Scanner;

public class DP30 { 
	public static void main(String as[])
	{
//		S-22 9 JULY OA CHALLENGE
//	P1:	You are given an array A. Size = N. You start at index 1 and end at index N. Find the number of ways to reach from index 1 to index N. 
//You have to follow some conditions. 
//Each number A[i] = 1 or 2 ; if you are at index i you can make a jump of size from range [1…..A[i]] 
//-> You can visit each index utmost once. 
//	*****You are allowed to jump backwards also but atmost 1 time.***** 
//		TC N, SC N
		int a[]={1,2,1,1,2},n=a.length;
		int dp[][]=new int[n+1][2];
//		dp[i][0]=no of ways to reach index i with 0 backward jump
//		dp[i][1]=no of ways to reach index i with 1 backward jump
//		observation: backward jump of 2 is IMPOSSIBLE, as it will lead to 2 visits of one element.
		dp[0][0]=1;//reach 0 with no backward jump
//		dp[0][1]=0;
		dp[1][0]=1; //reach 1 with 0 backward jump
//		dp[1][1]=0;
//		dp[i][0]=dp[i-1][0]+(dp[i-2][0]);
//		dp[i][1]=dp[i-1][1]+(dp[i-2][1])+(dp[i-3][0]);
		for(int i=2;i<n;i++)
		{
			dp[i][0]=dp[i-1][0];
			dp[i][1]=dp[i-1][1];
			if(a[i-2]==2)
			{
				dp[i][0]+=dp[i-2][0];
				dp[i][1]+=dp[i-2][1];
			}
//			i-3 to i-1 (+2 jump), i-1 to i-2 (-1 jump), i-2 to i (+2 jump) 
			if(i>=3 && a[i-3]==2 && a[i-2]==2) //to avoid -1 index. 
				dp[i][1]+=dp[i-3][0];
		}
		System.out.println(dp[n-1][0]+dp[n-1][1]); //including ways where 0 backward jumps and 1 backward jump is taking place.
	}
}