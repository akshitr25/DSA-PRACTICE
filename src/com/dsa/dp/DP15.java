package com.dsa.dp;

public class DP15 {
	public static void main(String as[])
	{//P0
//		You are given a positive integer 'N’. Your task is to find and return the minimum number of steps that 'N' has to take to get reduced to 1. 
//		You can perform any one of the following 3 steps:
//		1) Subtract 1 from it. (n = n - ­1) ,
//		2) If n is divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
//		3) If n is divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
		int n=10; //10,9,3,1
		int dp[]=new int[n+1];
		dp[1]=0;
//		dp[2]=1;
//		dp[3]=1;
//		dp[4]=Math.min(dp[2],dp[3]+1);
		for(int i=2;i<=n;i++)
		{
			int v1=dp[i-1]+1;
			int v2=Integer.MAX_VALUE;
			int v3=Integer.MAX_VALUE;
			if(i%2==0)
				v2=dp[i/2]+1;
			else if(i%3==0)
				v3=dp[i/3]+1;
			dp[i]=Math.min(Math.min(v1,v2),v3);
		}
		System.out.println(dp[n]);
	}
}
