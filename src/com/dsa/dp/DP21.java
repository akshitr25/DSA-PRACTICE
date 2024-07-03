package com.dsa.dp;

import java.util.Scanner;

public class DP21 {
	public static void main(String as[])
	{//S-16 (OA Challenge)
//		pick easy or hard (or no task) for each day and make sure that sum is max.
//		pick hard only if yday no task done
//		TC N*2=>N, SC N*2=>N ?
//		0 easy, 1 hard
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt(); //always 2 (easy/hard)
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[n+1][2];
		dp[0][0]=a[0][0];//easy
		dp[0][1]=a[0][1];//hard
		dp[1][0]=Math.max(dp[0][0],dp[0][1])+a[1][0];//easy
		dp[1][1]=a[1][1];
//		dp[i][0]=max(dp[i-1][0,dp[i-1][1]);//easy
//		dp[i][1]=max(dp[i-2][0],dp[i-2][1]);//hard
		for(int i=2;i<n;i++)
		{
			dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1])+a[i][0];//easy
			dp[i][1]=Math.max(dp[i-2][0],dp[i-2][1])+a[i][1];//hard
		}
		System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
	}
}
//4 2
//1 2
//4 10
//20 21
//2 23
