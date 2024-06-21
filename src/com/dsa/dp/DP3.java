package com.dsa.dp;

public class DP3 {
	public static void main(String as[])
	{
//		Select maximum sum subset from the two arrays such that no two elements are consecutive.
		int a[]={  1  , 5 ,3,21234},n=a.length;
		int b[]={-4509,200,3, 40  };
		int dp[]=new int[n];
		//dp[0]=max(a[0],b[0])=>max(1,-4509)=>1
		//dp[1]=max(a[1],b[1],dp[0])=>max(5,200,1)=>200
		//dp[i]=max(dp[i-2]+max(a[i],b[i]),dp[i-1]))
		dp[0]=Math.max(a[0],b[0]);
		dp[1]=Math.max(Math.max(a[1],b[1]),dp[0]);
		for(int i=2;i<n;i++) //O(N) instead of O(N*Q)
		{
			dp[i]=Math.max(dp[i-2]+Math.max(a[i],b[i]),dp[i-1]);
		}
		for(int i=0;i<n;i++)
			System.out.println(i+" "+dp[i]);
	}
}
