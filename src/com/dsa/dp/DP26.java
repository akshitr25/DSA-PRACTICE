package com.dsa.dp;

import java.util.Scanner;

public class DP26 { 
	public static void main(String as[])
	{//S-18 5 JULY OA CHALLENGE
//		Find the number of ways to make sum “y” with the numbers “1”,”2”,”4”,”6”. 
//		Condition :- 4 can be used at most 2 times. 
//		TC N, SC N*3=>N
//		int a[]={1,2,4,6},n=a.length;
		int n=5;
		int dp[][]=new int[n+1][3]; 
//		2d dp array
//		dp[i][0]=no of ways to make sum i by using 0 4s 
//		dp[i][1]=no of ways to make sum i by using 1 4s 
//		dp[i][2]=no of ways to make sum i by using 2 4s 
		dp[0][0]=1;//ways to make sum 0
//		dp[1][0]=1;// ways to make sum 1 (0 4s as 1<4)
//		dp[2][0]=dp[1][0]+dp[0][0];// ways to make sum 2 (0 4s as 2<4)
		for(int i=1;i<=n;i++)
		{
			boolean i2=i-2>=0;
			boolean i4=i-4>=0;
			boolean i6=i-6>=0;
			dp[i][0]=dp[i-1][0]+(i2?dp[i-2][0]:0)+(i6?dp[i-6][0]:0); //ways to make sum i by using '4' 0 times
			dp[i][1]=dp[i-1][1]+(i2?dp[i-2][1]:0)+(i4?dp[i-4][0]:0)+(i6?dp[i-6][1]:0); //ways to make sum i by using '4' 1 time
			dp[i][2]=dp[i-1][2]+(i2?dp[i-2][2]:0)+(i4?dp[i-4][1]:0)+(i6?dp[i-6][2]:0); //ways to make sum i by using '4' 2 times
		}
		System.out.println(dp[n][0]+dp[n][1]+dp[n][2]); //sum of all the 3 ways
	}
}