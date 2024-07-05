package com.dsa.dp;

import java.util.Scanner;

public class DP24 { //????? TOUGH
	public static void main(String as[])
	{//S-15
//		-> There are two arrays , 'B' and 'C' ; size of both the arrays is 'N' ;
//		-> At each index you are supposed to pick up an element either from array 'C' or array 'B'
//		->You have to maximize the final sum of all elements
//		->Condition : You cannot select 3 or more than 3 element consecutively from the same array.
		int b[]={0,5,3,4},c[]={0,10,10,10},n=b.length-1; //1 based indexing
		int bcount=0,ccount=0;
//		0 B, 1 C
		int dp[][][]=new int[n+1][3][3]; //best ans if size=i and current element is b/c. index,b/c,no of selected elements so far for b/c
		dp[1][1][1]=b[1];
		dp[1][1][2]=b[1];
		dp[1][2][1]=c[1];
		dp[1][2][2]=c[1];
//		dp[i][1][1]=b[i]+b[i-1]+Math.max(dp[i-2][2][2],dp[i-2][2][1]);//best ans if size=i and last two elements selected from b
//		dp[i][1][2]=b[i]+b[i-1]+max(dp[i-2][1][1],dp[i-2][1][2],dp[i-2][2][1]);
//		dp[i][2][1]=c[i]+c[i-1]+Math.max(dp[i-2][2][2],dp);
//		dp[i][2][2]=;
//		1 B, 2 C
		for(int i=2;i<=n;i++)
		{
			dp[i][1][1]=b[i]+b[i-1]+Math.max(dp[i-2][2][2],dp[i-2][2][1]);
			dp[i][1][2]=b[i]+c[i-1]+max(dp[i-2][1][1],dp[i-2][1][2],dp[i-2][2][1]);
			dp[i][2][1]=c[i]+b[i-1]+max(dp[i-2][2][1],dp[i-2][2][2],dp[i-2][1][2]);
			dp[i][2][2]=c[i]+c[i-1]+Math.max(dp[i-2][1][2],dp[i-2][1][1]);
		}
		System.out.println(max(dp[n][1][1],dp[n][2][2],dp[n][2][1]));
	}
	static int max(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
