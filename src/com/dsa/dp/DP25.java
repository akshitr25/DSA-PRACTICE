package com.dsa.dp;

import java.util.Scanner;

public class DP25 { 
	public static void main(String as[])
	{//S-18
//		P0
//		Find the number of ways to make sum “y” with the numbers “1”,”2”,”4”,”6”. 
//		int a[]={1,2,4,6},n=a.length;
//		TC N, SC N
		int n=3;
		int dp[]=new int[n+1];
//		dp[i]=ways to create i
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			int a=dp[i-1];
			int b=dp[i-2];
			int c=(i-4>=0?dp[i-4]:0);
			int d=(i-6>=0?dp[i-6]:0);
			dp[i]=a+b+c+d;
		}
		System.out.println(dp[n]);
	}
}
