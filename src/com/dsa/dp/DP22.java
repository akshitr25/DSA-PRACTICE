package com.dsa.dp;

import java.util.Scanner;

public class DP22 {
	public static void main(String as[])
	{//S-14 FOLLOW UP (FOR 4 CITIES A,B,C)
//		You work as a consultant and have clients in cityA, cityB, cityC. On a given day,
//		say i, you can either
//		work in cityA and make Ai dollars or you can work in cityB and make Bi dollars or you can work in cityB and make Ci dollars
//		You can also spend the day traveling between cityA and cityB in which case your earnings that day are 0.
//		FIND MAX EARNING
//		TC SC 
		int a[]={1,2,3,4,4},b[]={1,2,3,4,4},c[]= {3,1,2,100,4},n=a.length;
//		23,4,5,101 | 21,1,10,100
		int dp[][]=new int[n+1][3];
		dp[0][0]=a[0];//A
		dp[0][1]=b[0];//B
		dp[0][2]=c[0];//C
		dp[1][0]=dp[0][0]+a[1];//A
		dp[1][1]=dp[0][1]+b[1];//B
		dp[1][2]=dp[0][2]+c[1];//C
//		dp[i][0]=Math.max(dp[i-1][0],dp[i-2][1],dp[i-2][2])+a[i];//A
//		dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0],dp[i-2][2])+b[i];//B
//		dp[i][2]=Math.max(dp[i-1][2],dp[i-2][0],dp[i-2][1])+c[i];//C
//		0 A, 1 B, 2 C
		for(int i=2;i<n;i++)
		{
			dp[i][0]=max(dp[i-1][0],dp[i-2][1],dp[i-2][2])+a[i];//A
			dp[i][1]=max(dp[i-1][1],dp[i-2][0],dp[i-2][2])+b[i];//B
			dp[i][2]=max(dp[i-1][2],dp[i-2][0],dp[i-2][1])+c[i];//C
		}
		System.out.println(max(dp[n-1][0],dp[n-1][1],dp[n-1][2]));
	}
	static int max(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
