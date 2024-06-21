package com.dsa.dp;

public class DP2 {
	public static void main(String as[])
	{
		//Given an array of integers(positive as well as negative) ,select some elements from this array(select a subset) such that:-
//		1. Sum of those elements is maximum(Sum of the subset is maximum) .
//2. No two elements in the subset should be consecutive.
		int a[]= {2,4,6,7,8},n=a.length;
		int dp[]=new int[n];
		//dp[0]=2
		//dp[1]=Math.max(dp[0]->2,a[1]->4);dp[1]=4;
		//dp[2]=Math.max(dp[2-2=0]+a[2],dp[2-1])=>Math.max(2+6=8,4)=>8
		//dp[i]=Math.max(dp[i-2]+a[i],dp[i-1])
		//dp[i]=dp[i-1]+a[i];
		dp[0]=a[0];
		dp[1]=Math.max(a[1],dp[0]);
		for(int i=2;i<n;i++) //O(N) instead of O(N*Q)
		{
			dp[i]=Math.max(dp[i-2]+a[i],dp[i-1]);
		}
		for(int i=0;i<n;i++)
			System.out.println(i+" "+dp[i]);
	}
}
