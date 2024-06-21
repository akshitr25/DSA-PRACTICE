package com.dsa.dp;

public class DP8 {
	public static void main(String as[])
	{
		//you are at start index, and need to reach last index.
		//can make jumps of size 1,3,or 5.
		//array has +ve and -ve numbers.
		//FIND MAX SUM of journey from start to end (0 to n-1)
		int a[]={5,8,3,100,-5,-5,5,10},n=a.length;
		int dp[]=new int[n];
		dp[0]=a[0];
		dp[1]=a[1]+dp[0]; //0to1
		dp[2]=a[2]+dp[1]; //1to2
		dp[3]=Math.max(a[3]+dp[0],a[3]+dp[2]); //0to3 or 2to3
		dp[4]=Math.max(a[4]+dp[1],a[4]+dp[3]); //1to4 or 3to4
		//dp[5]=Math.max(Math.max(a[5]+dp[0],a[5]+dp[2]),a[5]+dp[4]);//0to5,2to5,4to5
		//dp[i]=Math.max(Math.max(a[i]+dp[i-1],a[i]+dp[i-3]),a[i],dp[i-5]);
		for(int i=5;i<n;i++)
		{
			dp[i]=Math.max(Math.max(a[i]+dp[i-1],a[i]+dp[i-3]),a[i]+dp[i-5]);
		}
		System.out.println(dp[n-1]);
	}
}
