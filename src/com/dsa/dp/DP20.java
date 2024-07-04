package com.dsa.dp;

import java.util.Scanner;

public class DP20 {
	public static void main(String as[])
	{//S-14
//		You work as a consultant and have clients in cityA and cityB. On a given day,
//		say i, you can either
//		work in cityA and make Ai dollars or you can work in cityB and make Bi dollars. 
//		You can also spend the day traveling between cityA and cityB in which case your earnings that day are 0.
//		FIND MAX EARNING
//		a and b never consecutive.
//		TC N, SC N
		int a[]={25,10,15,10,70},b[]={5,5,50,5,30},n=a.length;
//		23,4,5,101 | 21,1,10,100
//		25,10,15,10,70 | 5,5,0,5,30
//		1,2,3,4,4 | 1,2,3,4,4
		int dp[][]=new int[n+1][2];
		dp[0][0]=a[0];//A
		dp[0][1]=b[0];//B
		dp[1][0]=dp[0][0]+a[1];//A
		dp[1][1]=dp[0][1]+b[1];//B
//		dp[i][0]=Math.max(dp[i-1][0],dp[i-2][1])+a[i];//A
//		dp[i][1]=Math.max(dp[i-1][1],dp[i-2])+a[i];//B
//		0 A, 1 B
		for(int i=2;i<n;i++)
		{
			dp[i][0]=Math.max(dp[i-1][0],dp[i-2][1])+a[i];//A
			dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0])+b[i];//B
		}
		System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
	}
}
