package com.dsa.dp;

public class DP12 {
	public static void main(String as[])
	{
//		BEGIN FROM FIRST INDEX AND NEED TO REACH TO THE LAST INDEX.
//		can have jump of 1 or 2 or 3.
//		FIND NO OF JOURNEYS HAVIN SUM AS ODD. 
//		1 BASED INDEXING
//		dp[i][even]=no of even sum journey till index i
//		dp[i][odd]=no of odd sum journey till index i
		int a[]={0,2,3,5,8,10},n=a.length;
		int dp[][]=new int[n][3]; //1 odd 2 even
		if(a[1]%2!=0)	dp[1][1]=1; //odd
		else	dp[1][2]=1; //even
		if(a[2]%2==0)
		{
			dp[2][2]=dp[1][2];
			dp[2][1]=dp[1][1];
		}
		else
		{
			dp[2][2]=dp[1][1];
			dp[2][1]=dp[1][2];
		}
		//odd->dp[3][1]=dp[1][1]+dp[2][1]
		for(int i=3;i<n;i++)
		{
			if(a[i]%2==0)
			{
				dp[i][2]=dp[i-1][2]+dp[i-2][2]+dp[i-3][2];//i-1,i-2,i-3
				dp[i][1]=dp[i-1][1]+dp[i-2][1]+dp[i-3][1];
			}
			else //a[i] is odd
			{
				dp[i][2]=dp[i-1][1]+dp[i-2][1]+dp[i-3][1]; //i-1,i-2,i-3
				dp[i][1]=dp[i-1][2]+dp[i-2][2]+dp[i-3][2];
			}
		}
		System.out.println("EVEN JOURNEYS: "+dp[n-1][2]+"\nODD JOURNEYS: "+dp[n-1][1]);
	}
}
